package br.com.aws.dynamodb.operations;

import br.com.aws.dynamodb.domain.Aluguel;
import br.com.aws.dynamodb.mapper.AluguelMapper;
import br.com.aws.dynamodb.mapper.FilmeCategoriaMapper;
import br.com.aws.dynamodb.port.BuscaDadosAluguelPort;
import br.com.aws.dynamodb.repository.AluguelRepository;
import br.com.aws.dynamodb.repository.FilmeCategoryRespository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class BuscaAluguelOperation implements BuscaDadosAluguelPort {

    private final AluguelRepository aluguelRepository;



    @Override
    public List<Aluguel> buscarAlugelPorCodigoId(Integer rental_id) {
        return AluguelMapper.mapToDomain(aluguelRepository.buscarRentalPorCodigoId(rental_id));
    }

    @Override
    public List<Aluguel> buscarAlugelPorCodigoAll() {
        return AluguelMapper.mapToDomain(aluguelRepository.findAll());
    }
}
