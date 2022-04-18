package br.com.aws.dynamodb.controller.armazenamento;

import br.com.aws.dynamodb.mapper.AluguelMapper;
import br.com.aws.dynamodb.mapper.ArmazenamentoMapper;
import br.com.aws.dynamodb.response.AluguelResponse;
import br.com.aws.dynamodb.response.ArmazenamentoResponse;
import br.com.aws.dynamodb.usecase.AluguelUseCase;
import br.com.aws.dynamodb.usecase.ArmazenamentoUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/buscarArmazenamentoId")
public class ArmazenamentoController {

    private final ArmazenamentoUseCase armazenamentoUseCase;

    @GetMapping("/{storeId}/armazenamento")
    public ResponseEntity<List<ArmazenamentoResponse>> consultarArmazenamentoPorCodigId(
            @PathVariable(name = "storeId")Integer storeId) {

        List<ArmazenamentoResponse>  response = ArmazenamentoMapper.mapToResponse(armazenamentoUseCase.buscaPorArmazenamentoId(storeId));
        return ResponseEntity.ok(response);


    }
}
