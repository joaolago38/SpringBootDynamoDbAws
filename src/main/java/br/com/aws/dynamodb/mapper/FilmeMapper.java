package br.com.aws.dynamodb.mapper;

import br.com.aws.dynamodb.domain.Filme;
import br.com.aws.dynamodb.domain.FilmeCategoria;
import br.com.aws.dynamodb.entinty.FilmeCategoriaEntity;
import br.com.aws.dynamodb.entinty.FilmesEntity;
import br.com.aws.dynamodb.response.FilmeCategoriaResponse;
import br.com.aws.dynamodb.response.FilmeResponse;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.stream.Collectors;


@Mapper(componentModel = "spring")
public interface FilmeMapper {

    public static List<Filme> mapToDomain(List<FilmesEntity> filmesEntity){
        return filmesEntity.stream().map(FilmeMapper::mapToDomain).collect(Collectors.toList());
    }


    public static Filme mapToDomain(FilmesEntity filmesEntity){
       return Filme.builder().filmeId(filmesEntity.getFilmId()).description(filmesEntity.getDescription())
               .language_id(filmesEntity.getLanguageId()).title(filmesEntity.getTitle())
               .language_id(filmesEntity.getLanguageId()).release_year(filmesEntity.getReleaseYear())
               .length(filmesEntity.getLength()).rental_duration(filmesEntity.getRentalDuration())
               .replacement_cost(filmesEntity.getReplacementCost()).rental_rate(filmesEntity.getRentalRate()).description(filmesEntity.getDescription()).build();
    }



    public static List<FilmeResponse> mapToResponse(List<Filme> filme) {
        return filme.stream().map(FilmeMapper::mapToResponse).collect(Collectors.toList());
    }

    public static FilmeResponse mapToResponse(Filme filme) {
        return FilmeResponse.builder().filmId(filme.getFilmeId()).languageId(filme.getLanguage_id())
                .languageId(filme.getLanguage_id()).releaseYear(filme.getRelease_year())
                .rentalRate(filme.getRental_rate()).releaseYear(filme.getRelease_year())
                .rentalRate(filme.getRental_rate()).replacementCost(filme.getReplacement_cost())
                .length(filme.getLength()).title(filme.getTitle()).build();
    }


}