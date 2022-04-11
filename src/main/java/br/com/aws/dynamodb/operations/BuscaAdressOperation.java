package br.com.aws.dynamodb.operations;

import br.com.aws.dynamodb.domain.Actor;
import br.com.aws.dynamodb.domain.Adress;
import br.com.aws.dynamodb.mapper.ActorMapper;
import br.com.aws.dynamodb.mapper.AdressMapper;
import br.com.aws.dynamodb.port.BuscaDadosActorPort;
import br.com.aws.dynamodb.port.BuscaDadosAdressPort;
import br.com.aws.dynamodb.repository.ActorRespository;
import br.com.aws.dynamodb.repository.AdressRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class BuscaAdressOperation implements BuscaDadosAdressPort {

    private final AdressRepository adressRepository;

    @Override
    public List<Adress> buscarAdressPorCodigoId(Integer addressId) {
        return AdressMapper.mapToDomain(adressRepository.buscarAdressPorCodigoId(addressId));
    }

    @Override
    public List<Adress> buscarActorPorCodigoAll() {
        return AdressMapper.mapToDomain(adressRepository.findAll());
    }
}
