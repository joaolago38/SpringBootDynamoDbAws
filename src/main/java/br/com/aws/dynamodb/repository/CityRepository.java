package br.com.aws.dynamodb.repository;


import br.com.aws.dynamodb.entinty.CityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CityRepository extends JpaRepository<CityEntity, Integer  > {

    @Query(value = "select c from CityEntity c where c.city_id = :city_id")
    List<CityEntity> buscarCityPorCodigoId(@Param("city_id") Integer city_id);

    List<CityEntity> findAll();
}
