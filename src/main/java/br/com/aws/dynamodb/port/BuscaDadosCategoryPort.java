package br.com.aws.dynamodb.port;

import br.com.aws.dynamodb.domain.Category;

import java.util.List;

public interface BuscaDadosCategoryPort {

   List<Category> buscarCategoryPorCodigoId(Integer category_id);


   List<Category> buscarCategoryPorCodigoAll();
}
