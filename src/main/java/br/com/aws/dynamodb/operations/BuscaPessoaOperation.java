package br.com.aws.dynamodb.operations;

import br.com.aws.dynamodb.domain.Pagamento;
import br.com.aws.dynamodb.domain.Pessoa;
import br.com.aws.dynamodb.mapper.PagamentoMapper;
import br.com.aws.dynamodb.mapper.PessoaMapper;
import br.com.aws.dynamodb.port.BuscaDadosPessoaPort;
import br.com.aws.dynamodb.repository.PessoaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class BuscaPessoaOperation implements BuscaDadosPessoaPort {

    private final PessoaRepository pessoaRepository;


    @Override
    public List<Pessoa> buscarPessoaId(Integer staff_id) {
        return PessoaMapper.mapToDomain(pessoaRepository.buscarPessoaPorCodigoId(staff_id));
    }

    @Override
    public List<Pessoa> buscarPessoaAll() {
        return PessoaMapper.mapToDomain(pessoaRepository.findAll());
    }

}
