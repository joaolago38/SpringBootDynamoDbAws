package br.com.aws.dynamodb.port;


import br.com.aws.dynamodb.domain.Filme;

import java.util.List;

public interface BuscaDadosFilmePort {

   List<Filme> buscarFilmePorCodigoId(Integer filmeId);


   List<Filme> buscarFilmePorCodigoAll();
}
