package br.com.aws.dynamodb.usecase.actor;

import br.com.aws.dynamodb.domain.Actor;
import br.com.aws.dynamodb.entinty.ActorEntinty;
import br.com.aws.dynamodb.repository.ActorRespository;
import br.com.aws.dynamodb.usecase.ActorUseCase;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ActorUseCaseTest {
    @InjectMocks
    private ActorUseCase useCase;
    @Mock
    private ActorRespository actorRespository;
    @Test
    void whenAtorReturnaComSucesso() {

//        when(actorRespository.buscarActorPorCodigoId(1)).thenReturn(getActorActorEntity());
//        List<Actor> events = useCase.buscaPorActorId(1);
//        List<Actor> expectedEvents = Collections
//                .singletonList(Actor.builder().actor_id(1).first_name("testes").last_name("testes").last_update(new Date()).build());
//
//        assertEquals(expectedEvents, events);
    }

    private static List<ActorEntinty> getActorActorEntity(){
        return List.of(ActorEntinty.builder().actorId(1).firstName("testes").lastName("testes").lastUpdate(new Date()).build());
    }

}