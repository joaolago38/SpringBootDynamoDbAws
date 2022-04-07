package br.com.aws.dynamodb.repository;

;
import br.com.aws.dynamodb.entinty.ActorEntinty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ActorRespository extends JpaRepository<ActorEntinty, Integer  > {

    @Query(value = "select c from ActorEntinty c where c.actorId = :actor_id")
    List<ActorEntinty> buscarActorPorCodigoId(@Param("actor_id") Integer actorId);

    List<ActorEntinty> findAll();
}
