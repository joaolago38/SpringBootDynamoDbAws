package br.com.aws.dynamodb.controller.filme.categoria;

import br.com.aws.dynamodb.mapper.FilmeAtorMapper;
import br.com.aws.dynamodb.mapper.FilmeCategoriaMapper;
import br.com.aws.dynamodb.response.FilmeAtorResponse;
import br.com.aws.dynamodb.response.FilmeCategoriaResponse;
import br.com.aws.dynamodb.usecase.FilmeActorUseCase;
import br.com.aws.dynamodb.usecase.FilmeCategoryUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/buscarCategoria")
public class FilmeCategoriaController {

    private final FilmeCategoryUseCase filmeCategoriaUseCase;

    @GetMapping("/{categoryId}/filme_categoria")
    public ResponseEntity<List<FilmeCategoriaResponse>> consultarFilmeCategoriaPorCodigId(
            @PathVariable(name = "categoryId")Integer categoryId) {

        List<FilmeCategoriaResponse>  response = FilmeCategoriaMapper.mapToResponse(filmeCategoriaUseCase.buscaPorFilmeCategoryId(categoryId));
        return ResponseEntity.ok(response);


    }
}
