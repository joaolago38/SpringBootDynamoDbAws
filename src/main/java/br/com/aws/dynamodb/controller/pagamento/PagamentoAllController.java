package br.com.aws.dynamodb.controller.pagamento;

import br.com.aws.dynamodb.mapper.PagamentoMapper;
import br.com.aws.dynamodb.response.PagamentoResponse;
import br.com.aws.dynamodb.usecase.PagamentoUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/buscarAllPagamento")
public class PagamentoAllController {


    private final PagamentoUseCase pagamentoUseCase;

    @GetMapping()
    public ResponseEntity<List<PagamentoResponse>> consultarPagamentoPorAll( ) {

        List<PagamentoResponse>  response = PagamentoMapper.mapToResponse(pagamentoUseCase.buscaPagamentoFindAll());
        return ResponseEntity.ok(response);


    }
}
