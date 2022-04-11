//package br.com.aws.dynamodb.repository;
//
//import br.com.aws.dynamodb.entity.InventoryEntity;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//
//public interface InventoryRepository extends JpaRepository<InventoryEntity, Long  > {
//    @Query(value = "select c from InventoryEntity c where c.inventoryId = :inventoryId")
//    InventoryEntity buscarInventoryPorCodigoId(@Param("inventoryId") Long filmId);
//}
