package br.com.aws.dynamodb.port;


import br.com.aws.dynamodb.domain.Pessoa;

import java.util.List;

public interface BuscaDadosPessoaPort {

   List<Pessoa> buscarPessoaId(Integer staff_id);


   List<Pessoa> buscarPessoaAll();
}
