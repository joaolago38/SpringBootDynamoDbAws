package br.com.aws.dynamodb.usecase;

import br.com.aws.dynamodb.exception.ErroNegocioMensagemException;
import br.com.aws.dynamodb.domain.Actor;
import br.com.aws.dynamodb.port.BuscaDadosActorPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static br.com.aws.dynamodb.message.ErrorMessage.E000;

@Service
@RequiredArgsConstructor
public class ActorUseCase {

    private final BuscaDadosActorPort buscaDadosActorPort;

    public List<Actor> buscaPorActorId(Integer actor_Id){
        var actorRetorno = buscaDadosActorPort.buscarActorPorCodigoId(actor_Id);
         if(actorRetorno.isEmpty()){
             throw new ErroNegocioMensagemException(
                     E000.getCodigo(), E000.getMensagem(), new ArrayList<>());
         }

         return actorRetorno;
    }

    public List<Actor> buscaPorActorAll(){
        var actorRetorno = buscaDadosActorPort.buscarActorPorCodigoAll();
        if(actorRetorno.isEmpty()){
            throw new ErroNegocioMensagemException(
                    E000.getCodigo(), E000.getMensagem(), new ArrayList<>());
        }

        return actorRetorno;
    }



}
