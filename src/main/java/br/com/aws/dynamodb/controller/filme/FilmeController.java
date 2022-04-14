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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/buscarFilme")
public class FilmeController {

    private final FilmeUseCase filmeUseCase;

    @GetMapping("/{filmId}/filme")
    public ResponseEntity<List<FilmeResponse>> consultarFilmePorCodicoId(
            @PathVariable(name = "filmId")Integer filmId) {

        List<FilmeResponse>  response = FilmeMapper.mapToResponse(filmeUseCase.buscaPorFilmeId(filmId));
        return ResponseEntity.ok(response);


    }
}
