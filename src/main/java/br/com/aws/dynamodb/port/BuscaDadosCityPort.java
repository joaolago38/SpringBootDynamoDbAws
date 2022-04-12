package br.com.aws.dynamodb.port;

import br.com.aws.dynamodb.domain.City;

import java.util.List;

public interface BuscaDadosCityPort {

   List<City> buscarCityPorCodigoId(Integer category_id);


   List<City> buscarCityPorCodigoAll();
}
