package br.com.aws.dynamodb.repository;

import br.com.aws.dynamodb.entinty.CountryEntity;

import br.com.aws.dynamodb.entinty.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Integer  > {
    @Query(value = "select c from CustomerEntity c where c.customerId = :customerId")
   List<CustomerEntity> buscarCustumerPorCodigoId(@Param("customerId") Integer categoryId);

    List<CustomerEntity> findAll();
}
