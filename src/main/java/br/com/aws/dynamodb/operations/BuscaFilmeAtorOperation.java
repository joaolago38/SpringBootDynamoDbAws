package br.com.aws.dynamodb.operations;

import br.com.aws.dynamodb.domain.Customer;
import br.com.aws.dynamodb.domain.FilmeActor;
import br.com.aws.dynamodb.mapper.CustomerMapper;
import br.com.aws.dynamodb.mapper.FilmeAtorMapper;
import br.com.aws.dynamodb.port.BuscaDadosCustomerPort;
import br.com.aws.dynamodb.port.BuscaDadosFilmeAtorPort;
import br.com.aws.dynamodb.repository.CustomerRepository;
import br.com.aws.dynamodb.repository.FilmeActorRespository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class BuscaFilmeAtorOperation implements BuscaDadosFilmeAtorPort {

    private final FilmeActorRespository filmeActorRespository;


    @Override
    public List<FilmeActor> buscarFilmeAtorPorCodigoId(Integer film_id) {
        return FilmeAtorMapper.mapToDomain(filmeActorRespository.buscarFilmeActorPorCodigoId(film_id));
    }

    @Override
    public List<FilmeActor> buscarFilmeAtorPorCodigoAll() {
        return FilmeAtorMapper.mapToDomain(filmeActorRespository.findAll());
    }
}
