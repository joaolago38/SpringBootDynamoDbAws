package br.com.aws.dynamodb.mapper;

import br.com.aws.dynamodb.domain.FilmeActor;
import br.com.aws.dynamodb.domain.FilmeCategoria;
import br.com.aws.dynamodb.entinty.FilmeActorEntity;
import br.com.aws.dynamodb.entinty.FilmeCategoriaEntity;
import br.com.aws.dynamodb.response.FilmeAtorResponse;
import br.com.aws.dynamodb.response.FilmeCategoriaResponse;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.stream.Collectors;


@Mapper(componentModel = "spring")
public interface FilmeCategoriaMapper {

    public static List<FilmeCategoria> mapToDomain(List<FilmeCategoriaEntity> filmeActorEntity){
        return filmeActorEntity.stream().map(FilmeCategoriaMapper::mapToDomain).collect(Collectors.toList());
    }


    public static FilmeCategoria mapToDomain(FilmeCategoriaEntity filmeCategoriaEntity){
       return FilmeCategoria.builder().category_id(filmeCategoriaEntity.getCategoryId()).film_id(filmeCategoriaEntity.getFilmId()).last_update(filmeCategoriaEntity.getLastUpdate()).build();
    }



    public static List<FilmeCategoriaResponse> mapToResponse(List<FilmeCategoria>filmeCategoria) {
        return filmeCategoria.stream().map(FilmeCategoriaMapper::mapToResponse).collect(Collectors.toList());
    }

    public static FilmeCategoriaResponse mapToResponse(FilmeCategoria filmeCategoria) {
        return FilmeCategoriaResponse.builder().filmId(filmeCategoria.getFilm_id()).categoryId(filmeCategoria.getCategory_id()).lastUpdate(filmeCategoria.getLast_update()).build();
    }


}