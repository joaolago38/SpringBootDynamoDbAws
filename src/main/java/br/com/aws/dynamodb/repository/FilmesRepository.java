package br.com.aws.dynamodb.repository;

import br.com.aws.dynamodb.entinty.FilmesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FilmesRepository extends JpaRepository<FilmesEntity, Integer  > {
    @Query(value = "select c from FilmesEntity c where c.filmId = :filmId")
    List<FilmesEntity> buscarFilmePorCodigoId(@Param("filmId") Integer filmId);
    List<FilmesEntity> findAll();
}
