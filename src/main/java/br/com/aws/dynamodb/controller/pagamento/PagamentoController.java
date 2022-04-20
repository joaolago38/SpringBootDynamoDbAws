package br.com.aws.dynamodb.controller.pagamento;

import br.com.aws.dynamodb.mapper.LinguagemMapper;
import br.com.aws.dynamodb.mapper.PagamentoMapper;
import br.com.aws.dynamodb.response.LinguagemResponse;
import br.com.aws.dynamodb.response.PagamentoResponse;
import br.com.aws.dynamodb.usecase.LanguageUseCase;
import br.com.aws.dynamodb.usecase.PagamentoUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/buscarPagamento")
public class PagamentoController {

    private final PagamentoUseCase pagamentoUseCase;

    @GetMapping("/{payment_id}/pagamento")
    public ResponseEntity<List<PagamentoResponse>> consultarPagamentoPorCodicoId(
            @PathVariable(name = "payment_id")Integer payment_id) {

        List<PagamentoResponse>  response = PagamentoMapper.mapToResponse(pagamentoUseCase.buscaPorPagamentoId(payment_id));
        return ResponseEntity.ok(response);


    }
}
