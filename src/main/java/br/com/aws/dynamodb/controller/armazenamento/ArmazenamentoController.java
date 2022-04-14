package br.com.aws.dynamodb.controller.armazenamento;

import br.com.aws.dynamodb.mapper.AluguelMapper;
import br.com.aws.dynamodb.response.AluguelResponse;
import br.com.aws.dynamodb.usecase.AluguelUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/buscarArmazenamento")
public class ArmazenamentoController {

    private final AluguelUseCase aluguelUseCase;

    @GetMapping("/{rental_id}/aluguel")
    public ResponseEntity<List<AluguelResponse>> consultarAlugelPorCodigId(
            @PathVariable(name = "rental_id")Integer rental_id) {

        List<AluguelResponse>  response = AluguelMapper.mapToResponse(aluguelUseCase.buscaPorRentalId(rental_id));
        return ResponseEntity.ok(response);


    }
}
