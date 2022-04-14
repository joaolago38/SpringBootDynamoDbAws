package br.com.aws.dynamodb.controller.filme.categoria;

import br.com.aws.dynamodb.mapper.FilmeCategoriaMapper;
import br.com.aws.dynamodb.response.FilmeCategoriaResponse;
import br.com.aws.dynamodb.usecase.FilmeCategoryUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/buscarAllFilmeCategoria")
public class FilmeCategoriaAllController {


    private final FilmeCategoryUseCase filmeCategoriaUseCase;

    @GetMapping()
    public ResponseEntity<List<FilmeCategoriaResponse>> consultarFilmeCAtegoriaPorAll( ) {

        List<FilmeCategoriaResponse>  response = FilmeCategoriaMapper.mapToResponse(filmeCategoriaUseCase.buscaCategoriaAtorAll());
        return ResponseEntity.ok(response);


    }
}
