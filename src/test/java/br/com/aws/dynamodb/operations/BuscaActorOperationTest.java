package br.com.aws.dynamodb.operations;

import br.com.aws.dynamodb.domain.Actor;
import br.com.aws.dynamodb.entinty.ActorEntinty;
import br.com.aws.dynamodb.mapper.ActorMapper;
import br.com.aws.dynamodb.repository.ActorRespository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class BuscaActorOperationTest {

    @InjectMocks
    private BuscaActorOperation buscaActorOperation;

    @Mock
    private ActorRespository repository;

    @Mock
    private ActorMapper mapper;

    @Test
    void deveConsultarPorCodigoAtorComSucesso() {
        when(repository.buscarActorPorCodigoId(any()))
                .thenReturn(Collections.singletonList(ActorEntinty.builder().build()));
        when(mapper.toModel(any())).thenReturn(Actor.builder().build());

        var actors = buscaActorOperation.buscarActorPorCodigoId(1);

        Assertions.assertEquals(1, actors.size());
    }

}