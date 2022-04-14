package br.com.aws.dynamodb.repository;

import br.com.aws.dynamodb.entinty.AluguelEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AluguelRepository extends JpaRepository<AluguelEntity, Integer  > {
    @Query(value = "select c from AluguelEntity c where c.rentalId = :rentalId")
   List<AluguelEntity>  buscarRentalPorCodigoId(@Param("rentalId") Integer filmId);

    List<AluguelEntity> findAll();
}
