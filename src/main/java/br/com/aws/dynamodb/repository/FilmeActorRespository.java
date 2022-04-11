//package br.com.aws.dynamodb.repository;
//
//import br.com.aws.dynamodb.entity.FilmeActorEntity;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//
//public interface FilmeActorRespository extends JpaRepository<FilmeActorEntity, Long  > {
//    @Query(value = "select c from FilmeActorEntity c where c.filmId = :filmId")
//    FilmeActorEntity buscarFilmeActorPorCodigoId(@Param("filmId") Long filmId);
//}
