package br.com.aws.dynamodb.controller;

import br.com.aws.dynamodb.mapper.ActorMapper;
import br.com.aws.dynamodb.response.ActorResponse;
import br.com.aws.dynamodb.usecase.ActorUseCase;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequiredArgsConstructor
@RequestMapping("/buscarActor")
public class ActorController {

    private final ActorUseCase actorUseCase;

    @GetMapping("/{actor_id}/actor")
    public ResponseEntity<List<ActorResponse>> consultarActorPorCodigId(
           @PathVariable(name = "actor_id")Integer actorId) {

           List<ActorResponse>  response =ActorMapper.mapToResponse(actorUseCase.buscaPorActorId(actorId));
          return ResponseEntity.ok(response);


    }
}

