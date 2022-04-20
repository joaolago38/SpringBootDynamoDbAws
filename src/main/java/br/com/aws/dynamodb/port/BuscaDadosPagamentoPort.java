package br.com.aws.dynamodb.port;


import br.com.aws.dynamodb.domain.Pagamento;

import java.util.List;

public interface BuscaDadosPagamentoPort {

   List<Pagamento> buscarPagamentoId(Integer payment_id);


   List<Pagamento> buscarPagamentoAll();
}
