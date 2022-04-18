package br.com.aws.dynamodb.repository;

import br.com.aws.dynamodb.entinty.ArmazenamentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ArmazenamentoRepository extends JpaRepository<ArmazenamentoEntity, Integer  > {
    @Query(value = "select c from ArmazenamentoEntity c where c.storeId = :storeId")
   List<ArmazenamentoEntity>  buscarArmazenamentoPorCodigoId(@Param("storeId") Integer storeId);

    List<ArmazenamentoEntity> findAll();
}
