//package br.com.aws.dynamodb.repository;
//
//import br.com.aws.dynamodb.entity.FilmEntity;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//
//public interface FilmRepository extends JpaRepository<FilmEntity, Long  > {
//    @Query(value = "select c from FilmEntity c where c.filmId = :filmId")
//    FilmEntity buscarFilmePorCodigoId(@Param("filmId") Long filmId);
//}
