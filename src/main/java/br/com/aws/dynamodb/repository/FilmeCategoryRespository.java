package br.com.aws.dynamodb.repository;


import br.com.aws.dynamodb.entinty.FilmeCategoriaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FilmeCategoryRespository extends JpaRepository<FilmeCategoriaEntity, Integer  > {

    @Query(value = "select c from FilmeCategoriaEntity c where c.categoryId = :categoryId")
    List<FilmeCategoriaEntity> buscarFilmeCategoriaPorCodigoId(@Param("categoryId") Integer categoryId);

     List<FilmeCategoriaEntity> findAll();
}
