package br.com.aws.dynamodb.repository;


import br.com.aws.dynamodb.entinty.CountryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CountryRepository extends JpaRepository<CountryEntity, Integer  > {

    @Query(value = "select c from CountryEntity c where c.countryId = :countryId")
    List<CountryEntity> buscarCountryPorCodigoId(@Param("countryId") Integer countryId);

    List<CountryEntity> findAll();
}
