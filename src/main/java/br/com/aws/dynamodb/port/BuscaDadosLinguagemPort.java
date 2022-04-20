package br.com.aws.dynamodb.port;


import br.com.aws.dynamodb.domain.Linguagem;

import java.util.List;

public interface BuscaDadosLinguagemPort {

   List<Linguagem> buscarLinguageId(Integer languageId);


   List<Linguagem> buscarLinguagemAll();
}
