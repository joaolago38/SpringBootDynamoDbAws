package br.com.aws.dynamodb.port;


import br.com.aws.dynamodb.domain.FilmeCategoria;

import java.util.List;

public interface BuscaDadosFilmeCategoriaPort {

   List<FilmeCategoria> buscarFilmeCategoriaPorCodigoId(Integer category_id);


   List<FilmeCategoria> buscarFilmeCategoriaPorCodigoAll();
}
