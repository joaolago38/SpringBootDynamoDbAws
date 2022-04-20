package br.com.aws.dynamodb.operations;

import br.com.aws.dynamodb.domain.Pagamento;
import br.com.aws.dynamodb.mapper.PagamentoMapper;
import br.com.aws.dynamodb.port.BuscaDadosPagamentoPort;
import br.com.aws.dynamodb.repository.PagamentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class BuscaPagamentoOperation implements BuscaDadosPagamentoPort {

    private final PagamentoRepository pagamentoRepository;

    @Override
    public List<Pagamento> buscarPagamentoId(Integer payment_id) {
        return PagamentoMapper.mapToDomain(pagamentoRepository.buscarPagamentoPorCodigoId(payment_id));
    }

    @Override
    public List<Pagamento> buscarPagamentoAll() {
        return PagamentoMapper.mapToDomain(pagamentoRepository.findAll());
    }
}
