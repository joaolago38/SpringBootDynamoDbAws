package br.com.aws.dynamodb.repository;

import br.com.aws.dynamodb.entinty.PessoaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PessoaRepository extends JpaRepository<PessoaEntity, Integer  > {
    @Query(value = "select c from PessoaEntity c where c.staffId = :staffId")
   List<PessoaEntity>  buscarPessoaPorCodigoId(@Param("staffId") Integer staffId);

    List<PessoaEntity> findAll();
}
