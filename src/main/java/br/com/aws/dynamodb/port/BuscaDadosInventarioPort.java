package br.com.aws.dynamodb.port;


import br.com.aws.dynamodb.domain.Inventario;

import java.util.List;

public interface BuscaDadosInventarioPort {

   List<Inventario> buscarInventarioId(Integer inventory_id);


   List<Inventario> buscarInventarioPorCodigoAll();
}
