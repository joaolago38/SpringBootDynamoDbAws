package br.com.aws.dynamodb.usecase;


import br.com.aws.dynamodb.domain.Linguagem;
import br.com.aws.dynamodb.exception.ErroNegocioMensagemException;
import br.com.aws.dynamodb.port.BuscaDadosLinguagemPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static br.com.aws.dynamodb.message.ErrorMessage.E0010;


@Service
@RequiredArgsConstructor
public class LanguageUseCase {

    private final BuscaDadosLinguagemPort buscaDadosLinguagemPort;

    public List<Linguagem> buscaPorLanguageId(Integer languageId) {
        var linguageIdRetorno = buscaDadosLinguagemPort.buscarLinguageId(languageId);
        if (linguageIdRetorno.isEmpty()) {
            throw new ErroNegocioMensagemException(
                    E0010.getCodigo(), E0010.getMensagem(), new ArrayList<>());
        }
        return linguageIdRetorno;

    }

    public List<Linguagem> buscaLinguagemAll(){
        var linguageIdRetorno = buscaDadosLinguagemPort.buscarLinguagemAll();
        if(linguageIdRetorno.isEmpty()){
            throw new ErroNegocioMensagemException(
                    E0010.getCodigo(), E0010.getMensagem(), new ArrayList<>());
        }

        return linguageIdRetorno;
    }
}
