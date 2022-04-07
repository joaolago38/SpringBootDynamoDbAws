package br.com.aws.dynamodb.controller;

import br.com.aws.dynamodb.mapper.ActorMapper;
import br.com.aws.dynamodb.response.ActorResponse;
import br.com.aws.dynamodb.usecase.ActorUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/buscarActor")
public class ActorAllController {


    private final ActorUseCase actorUseCase;

    @GetMapping()
    public ResponseEntity<List<ActorResponse>> consultarActorPorAll( ) {

        List<ActorResponse>  response = ActorMapper.mapToResponse(actorUseCase.buscaPorActorAll());
        return ResponseEntity.ok(response);


    }
}
