package br.com.aws.dynamodb.port;


import br.com.aws.dynamodb.domain.Armazenamento;
import br.com.aws.dynamodb.entinty.ArmazenamentoEntity;

import java.util.List;

public interface BuscaDadosArmazenamentoPort {

   List<Armazenamento> buscarArmazenamentoPorCodigoId(Integer store_id);


   List<Armazenamento> buscarArmazenamentoPorCodigoAll();
}
