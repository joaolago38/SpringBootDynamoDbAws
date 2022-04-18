package br.com.aws.dynamodb.operations;

import br.com.aws.dynamodb.domain.Armazenamento;
import br.com.aws.dynamodb.entinty.ArmazenamentoEntity;
import br.com.aws.dynamodb.mapper.ArmazenamentoMapper;
import br.com.aws.dynamodb.port.BuscaDadosArmazenamentoPort;
import br.com.aws.dynamodb.repository.ArmazenamentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class BuscaArmazenamentoOperation implements BuscaDadosArmazenamentoPort {

    private final ArmazenamentoRepository armazenamentoRepository;


    @Override
    public List<Armazenamento> buscarArmazenamentoPorCodigoId(Integer store_id) {
        return ArmazenamentoMapper.mapToDomain(armazenamentoRepository.buscarArmazenamentoPorCodigoId(store_id));
    }

    @Override
    public List<Armazenamento> buscarArmazenamentoPorCodigoAll() {
        return ArmazenamentoMapper.mapToDomain(armazenamentoRepository.findAll());
    }
}
