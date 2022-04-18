package br.com.aws.dynamodb.repository;

import br.com.aws.dynamodb.entinty.InventarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface InventarioRepository extends JpaRepository<InventarioEntity, Integer  > {
    @Query(value = "select c from InventarioEntity c where c.inventoryId = :inventoryId")
    List<InventarioEntity> buscarInventoryPorCodigoId(@Param("inventoryId") Integer inventoryId);
    List<InventarioEntity> findAll();
}
