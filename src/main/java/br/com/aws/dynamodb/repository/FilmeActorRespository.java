package br.com.aws.dynamodb.repository;


import br.com.aws.dynamodb.entinty.FilmeActorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FilmeActorRespository extends JpaRepository<FilmeActorEntity, Integer  > {
    @Query(value = "select c from FilmeActorEntity c where c.filmId = :filmId")
    List<FilmeActorEntity> buscarFilmeActorPorCodigoId(@Param("filmId") Integer filmId);

     List<FilmeActorEntity> findAll();
}
