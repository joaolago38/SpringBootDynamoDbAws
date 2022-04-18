package br.com.aws.dynamodb.controller.armazenamento;

import br.com.aws.dynamodb.mapper.AdressMapper;
import br.com.aws.dynamodb.mapper.ArmazenamentoMapper;
import br.com.aws.dynamodb.response.ArmazenamentoResponse;
import br.com.aws.dynamodb.usecase.ArmazenamentoUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/buscarAllArmazenamento")
public class ArmazenamentoAllController {


    private final ArmazenamentoUseCase armazenamentoUseCase;

    @GetMapping()
    public ResponseEntity<List<ArmazenamentoResponse>> consultarArmazenamentoPorAll( ) {

        List<ArmazenamentoResponse>  response = ArmazenamentoMapper.mapToResponse(armazenamentoUseCase.buscaPorArmazenamentolAll());
        return ResponseEntity.ok(response);


    }
}
