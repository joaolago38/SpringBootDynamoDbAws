//package br.com.aws.dynamodb.repository;
//
//
//import br.com.aws.dynamodb.entinty.StaffEntity;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//
//public interface StaffRepository extends JpaRepository<StaffEntity, Long  > {
//    @Query(value = "select c from StaffEntity c where c.staffId = :staffId")
//    StaffEntity buscarStaffPorCodigoId(@Param("staffId") Long staffId);
//}
