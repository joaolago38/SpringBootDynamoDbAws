package br.com.aws.dynamodb.operations;

import br.com.aws.dynamodb.mapper.ActorMapper;
import br.com.aws.dynamodb.domain.Actor;
import br.com.aws.dynamodb.port.BuscaDadosActorPort;
import br.com.aws.dynamodb.repository.ActorRespository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class BuscaActorOperation implements BuscaDadosActorPort {

    private final ActorRespository actorRespository;

    @Override
    public List<Actor> buscarActorPorCodigoId(Integer actor_Id) {

        return ActorMapper.mapToDomain(actorRespository.buscarActorPorCodigoId(actor_Id));
    }

    @Override
    public List<Actor> buscarActorPorCodigoAll() {
        return ActorMapper.mapToDomain(actorRespository.findAll());
    }
}
