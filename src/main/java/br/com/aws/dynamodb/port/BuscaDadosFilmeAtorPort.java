package br.com.aws.dynamodb.port;


import br.com.aws.dynamodb.domain.FilmeActor;

import java.util.List;

public interface BuscaDadosFilmeAtorPort {

   List<FilmeActor> buscarFilmeAtorPorCodigoId(Integer film_id);


   List<FilmeActor> buscarFilmeAtorPorCodigoAll();
}
