package br.com.aws.dynamodb.repository;


import br.com.aws.dynamodb.entinty.LinguagemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LinguagemRespository extends JpaRepository<LinguagemEntity, Integer  > {
    @Query(value = "select c from LinguagemEntity c where c.languageId = :languageId")
    List<LinguagemEntity> buscarLanguagePorCodigoId(@Param("languageId") Integer language_id);
    List<LinguagemEntity> findAll();

}
