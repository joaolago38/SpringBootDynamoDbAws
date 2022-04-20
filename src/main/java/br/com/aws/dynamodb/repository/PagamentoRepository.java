package br.com.aws.dynamodb.repository;

import br.com.aws.dynamodb.entinty.PagamentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PagamentoRepository extends JpaRepository<PagamentoEntity, Integer  > {

    @Query(value = "select c from PagamentoEntity c where c.payment_id = :payment_id")
    List<PagamentoEntity> buscarPagamentoPorCodigoId(@Param("payment_id") Integer payment_id);
    List<PagamentoEntity> findAll();
}
