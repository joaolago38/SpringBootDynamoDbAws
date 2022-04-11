package br.com.aws.dynamodb.repository;

import br.com.aws.dynamodb.entinty.RentalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RentalRepository extends JpaRepository<RentalEntity, Long  > {
    @Query(value = "select c from RentalEntity c where c.rentalId = :rentalId")
    RentalEntity buscarRentalPorCodigoId(@Param("rentalId") Long filmId);
}
