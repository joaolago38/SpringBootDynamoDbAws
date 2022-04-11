//package br.com.aws.dynamodb.repository;
//
//import br.com.aws.dynamodb.entinty.StoreEntity;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//
//public interface StoreRepository extends JpaRepository<StoreEntity, Long  > {
//    @Query(value = "select c from StoreEntity c where c.staffId = :staffId")
//    StoreEntity buscarStorePorCodigoId(@Param("staffId") Long staffId);
//}
