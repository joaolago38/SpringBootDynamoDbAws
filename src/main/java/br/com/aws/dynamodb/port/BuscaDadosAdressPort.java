package br.com.aws.dynamodb.port;

import br.com.aws.dynamodb.domain.Adress;

import java.util.List;

public interface BuscaDadosAdressPort {

   List<Adress> buscarAdressPorCodigoId(Integer adressRetorno);

   List<Adress> buscarActorPorCodigoAll();
}
