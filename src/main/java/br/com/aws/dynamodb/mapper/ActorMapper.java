package br.com.aws.dynamodb.mapper;

import br.com.aws.dynamodb.entinty.ActorEntinty;
import br.com.aws.dynamodb.domain.Actor;
import br.com.aws.dynamodb.response.ActorResponse;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.stream.Collectors;


@Mapper(componentModel = "spring")
public interface ActorMapper {

    public static Actor mapToDomain(ActorEntinty actorEntity){
        return Actor.builder().actor_id(actorEntity.getActorId()).first_name(actorEntity.getFirstName()).last_name(actorEntity.getLastName()).last_update(actorEntity.getLastUpdate()).last_name(actorEntity.getLastName()).last_name(actorEntity.getLastName()).build();
    }

    public static List<Actor> mapToDomain(List<ActorEntinty> actorEntinty){
        return actorEntinty.stream().map(ActorMapper::mapToDomain).collect(Collectors.toList());
    }


    public static List<ActorResponse> mapToResponse(List<Actor> actor) {
        return actor.stream().map(ActorMapper::mapToResponse).collect(Collectors.toList());
    }

    public static ActorResponse mapToResponse(Actor actor) {
        return ActorResponse.builder().actorId(actor.getActor_id()).firstName(actor.getFirst_name()).lastName(actor.getLast_name()).lastUpdate(actor.getLast_update()).build();
    }


}
