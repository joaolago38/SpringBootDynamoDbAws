package br.com.aws.dynamodb.controller.filme.actor;

import br.com.aws.dynamodb.mapper.CustomerMapper;
import br.com.aws.dynamodb.mapper.FilmeAtorMapper;
import br.com.aws.dynamodb.response.CustomerResponse;
import br.com.aws.dynamodb.response.FilmeAtorResponse;
import br.com.aws.dynamodb.usecase.CustomerUseCase;
import br.com.aws.dynamodb.usecase.FilmeActorUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/buscarAllFilmeAtor")
public class FilmeAtorAllController {


    private final FilmeActorUseCase filmeActorUseCase;

    @GetMapping()
    public ResponseEntity<List<FilmeAtorResponse>> consultarFilmeAtorPorAll( ) {

        List<FilmeAtorResponse>  response = FilmeAtorMapper.mapToResponse(filmeActorUseCase.buscaFilmeAtorAll());
        return ResponseEntity.ok(response);


    }
}
