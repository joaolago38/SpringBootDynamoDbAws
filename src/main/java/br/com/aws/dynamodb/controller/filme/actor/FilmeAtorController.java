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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/buscarFilmeAtor")
public class FilmeAtorController {

    private final FilmeActorUseCase filmeActorUseCase;

    @GetMapping("/{filmId}/filme_actor")
    public ResponseEntity<List<FilmeAtorResponse>> consultarFilmeAtorPorCodigId(
            @PathVariable(name = "filmId")Integer filmId) {

        List<FilmeAtorResponse>  response = FilmeAtorMapper.mapToResponse(filmeActorUseCase.buscaPorFilmeActorId(filmId));
        return ResponseEntity.ok(response);


    }
}
