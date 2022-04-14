package br.com.aws.dynamodb.port;


import br.com.aws.dynamodb.domain.Aluguel;

import java.util.List;

public interface BuscaDadosArmazenamentoPort {

   List<Aluguel> buscarAlugelPorCodigoId(Integer rental_id);


   List<Aluguel> buscarAlugelPorCodigoAll();
}
