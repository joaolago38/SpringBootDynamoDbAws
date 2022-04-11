//package br.com.aws.dynamodb.repository;
//
//import br.com.aws.dynamodb.entity.PaymentEntity;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//
//public interface PaymentRepository extends JpaRepository<PaymentEntity, Long  > {
//    @Query(value = "select c from PaymentEntity c where c.paymentId = :paymentId")
//    PaymentEntity buscarLanguagePorCodigoId(@Param("paymentId") Long filmId);
//}
