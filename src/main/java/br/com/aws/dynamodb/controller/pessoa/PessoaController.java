package br.com.aws.dynamodb.controller.pessoa;

import br.com.aws.dynamodb.mapper.PagamentoMapper;
import br.com.aws.dynamodb.mapper.PessoaMapper;
import br.com.aws.dynamodb.response.PagamentoResponse;
import br.com.aws.dynamodb.response.PessoaResponse;
import br.com.aws.dynamodb.usecase.PagamentoUseCase;
import br.com.aws.dynamodb.usecase.PessoaUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/buscarPessoa")
public class PessoaController {

    private final PessoaUseCase pessoaUseCase;

    @GetMapping("/{staffId}/pessoa")
    public ResponseEntity<List<PessoaResponse>> consultarPessoaPorCodicoId(
            @PathVariable(name = "staffId")Integer staffId) {

        List<PessoaResponse>  response = PessoaMapper.mapToResponse(pessoaUseCase.buscaPorPessoaId(staffId));
        return ResponseEntity.ok(response);


    }
}
