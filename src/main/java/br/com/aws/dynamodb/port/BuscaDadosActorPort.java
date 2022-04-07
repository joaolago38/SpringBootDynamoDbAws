package br.com.aws.dynamodb.port;

import br.com.aws.dynamodb.domain.Actor;

import java.util.List;

public interface BuscaDadosActorPort {

   List<Actor> buscarActorPorCodigoId(Integer actor_Id);

   List<Actor> buscarActorPorCodigoAll();
}
