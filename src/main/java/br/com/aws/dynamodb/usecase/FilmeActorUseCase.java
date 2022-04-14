package br.com.aws.dynamodb.usecase;

import br.com.aws.dynamodb.domain.Customer;
import br.com.aws.dynamodb.domain.FilmeActor;
import br.com.aws.dynamodb.exception.ErroNegocioMensagemException;

import br.com.aws.dynamodb.port.BuscaDadosFilmeAtorPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static br.com.aws.dynamodb.message.ErrorMessage.*;


@Service
@RequiredArgsConstructor
public class FilmeActorUseCase {

    private final BuscaDadosFilmeAtorPort buscaDadosFilmeAtorPort;

    public List<FilmeActor> buscaPorFilmeActorId(Integer filmeActorId) {
        var filmeActorRetorno = buscaDadosFilmeAtorPort.buscarFilmeAtorPorCodigoId(filmeActorId);
        if (filmeActorRetorno.isEmpty()) {
            throw new ErroNegocioMensagemException(
                    E006.getCodigo(), E006.getMensagem(), new ArrayList<>());
        }
        return filmeActorRetorno;

    }

    public List<FilmeActor> buscaFilmeAtorAll(){
        var filmeActorRetorno = buscaDadosFilmeAtorPort.buscarFilmeAtorPorCodigoAll();
        if(filmeActorRetorno.isEmpty()){
            throw new ErroNegocioMensagemException(
                    E003.getCodigo(), E001.getMensagem(), new ArrayList<>());
        }

        return filmeActorRetorno;
    }
}
