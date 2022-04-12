package br.com.aws.dynamodb.port;


import br.com.aws.dynamodb.domain.Country;

import java.util.List;

public interface BuscaDadosCountryPort {

   List<Country> buscarCountryPorCodigoId(Integer category_id);


   List<Country> buscarCountryPorCodigoAll();
}
