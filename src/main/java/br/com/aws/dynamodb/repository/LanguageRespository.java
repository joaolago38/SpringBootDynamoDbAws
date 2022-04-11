//package br.com.aws.dynamodb.repository;
//
//import br.com.aws.dynamodb.entity.LanguageEntity;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//
//public interface LanguageRespository extends JpaRepository<LanguageEntity, Long  > {
//    @Query(value = "select c from LanguageEntity c where c.languageId = :languageId")
//    LanguageEntity buscarLanguagePorCodigoId(@Param("languageId") Long filmId);
//}
