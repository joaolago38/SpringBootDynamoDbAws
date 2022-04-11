package br.com.aws.dynamodb.repository;



import br.com.aws.dynamodb.entinty.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Integer  > {
    @Query(value = "select c from CategoryEntity c where c.categoryId = :categoryId")
    List<CategoryEntity> buscarCategoryPorCodigoId(@Param("categoryId") Integer categoryId);

    List<CategoryEntity> findAll();
}
