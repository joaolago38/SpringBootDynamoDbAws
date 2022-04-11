package br.com.aws.dynamodb.repository;

import br.com.aws.dynamodb.entinty.AdressEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AdressRepository extends JpaRepository<AdressEntity, Integer > {
    @Query(value = "select c from AdressEntity c where c.addressId = :addressId")
   List<AdressEntity> buscarAdressPorCodigoId(@Param("addressId") Integer addressId);

    List<AdressEntity> findAll();
}
