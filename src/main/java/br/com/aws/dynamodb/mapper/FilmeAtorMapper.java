package br.com.aws.dynamodb.mapper;

import br.com.aws.dynamodb.domain.FilmeActor;
import br.com.aws.dynamodb.entinty.FilmeActorEntity;
import br.com.aws.dynamodb.response.FilmeAtorResponse;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.stream.Collectors;


@Mapper(componentModel = "spring")
public interface FilmeAtorMapper {

    public static List<FilmeActor> mapToDomain(List<FilmeActorEntity> filmeActorEntity){
        return filmeActorEntity.stream().map(FilmeAtorMapper::mapToDomain).collect(Collectors.toList());
    }


    public static FilmeActor mapToDomain(FilmeActorEntity filmeActorEntity){
       return FilmeActor.builder().actor_id(filmeActorEntity.getActorId()).film_id(filmeActorEntity.getFilmId())
               .last_update(filmeActorEntity.getLastUpdate()).build();
    }



    public static List<FilmeAtorResponse> mapToResponse(List<FilmeActor>filmeActor) {
        return filmeActor.stream().map(FilmeAtorMapper::mapToResponse).collect(Collectors.toList());
    }

    public static FilmeAtorResponse mapToResponse(FilmeActor filmeActor) {
        return FilmeAtorResponse.builder().filmId(filmeActor.getActor_id()).actorId(filmeActor.getActor_id()).filmId(filmeActor.getFilm_id()).lastUpdate(filmeActor.getLast_update()).build();
    }


}
