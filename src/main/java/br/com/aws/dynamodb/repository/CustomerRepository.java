//package br.com.aws.dynamodb.repository;
//
//import br.com.aws.dynamodb.entity.CustomerEntity;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//
//public interface CustomerRepository extends JpaRepository<CustomerEntity, Long  > {
//    @Query(value = "select c from CustomerEntity c where c.customerId = :customerId")
//    CustomerEntity buscarCustumerPorCodigoId(@Param("customerId") Long categoryId);
//}
