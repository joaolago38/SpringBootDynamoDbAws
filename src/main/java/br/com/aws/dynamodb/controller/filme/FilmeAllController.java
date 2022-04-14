package br.com.aws.dynamodb.controller.filme;

import br.com.aws.dynamodb.mapper.FilmeCategoriaMapper;
import br.com.aws.dynamodb.mapper.FilmeMapper;
import br.com.aws.dynamodb.response.FilmeCategoriaResponse;
import br.com.aws.dynamodb.response.FilmeResponse;
import br.com.aws.dynamodb.usecase.FilmeCategoryUseCase;
import br.com.aws.dynamodb.usecase.FilmeUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/buscarAllFilme")
public class FilmeAllController {


    private final FilmeUseCase filmeUseCase;

    @GetMapping()
    public ResponseEntity<List<FilmeResponse>> consultarFilmePorAll( ) {

        List<FilmeResponse>  response = FilmeMapper.mapToResponse(filmeUseCase.buscaFilmeAll());
        return ResponseEntity.ok(response);


    }
}
