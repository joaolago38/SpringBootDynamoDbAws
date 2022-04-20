package br.com.aws.dynamodb.controller.pessoa;

import br.com.aws.dynamodb.mapper.PagamentoMapper;
import br.com.aws.dynamodb.mapper.PessoaMapper;
import br.com.aws.dynamodb.response.PagamentoResponse;
import br.com.aws.dynamodb.response.PessoaResponse;
import br.com.aws.dynamodb.usecase.PessoaUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/buscarAllPessoa")
public class PessoaAllController {


    private final PessoaUseCase pessoaUseCase;

    @GetMapping()
    public ResponseEntity<List<PessoaResponse>> consultarPessoaPorAll( ) {

        List<PessoaResponse>  response = PessoaMapper.mapToResponse(pessoaUseCase.buscaPessoaAll());
        return ResponseEntity.ok(response);


    }
}
