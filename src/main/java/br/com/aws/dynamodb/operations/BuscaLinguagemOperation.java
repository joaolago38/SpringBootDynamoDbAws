package br.com.aws.dynamodb.operations;

import br.com.aws.dynamodb.domain.Linguagem;
import br.com.aws.dynamodb.mapper.LinguagemMapper;
import br.com.aws.dynamodb.port.BuscaDadosLinguagemPort;
import br.com.aws.dynamodb.repository.LinguagemRespository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class BuscaLinguagemOperation implements BuscaDadosLinguagemPort {

    private final LinguagemRespository linguagemRespository;



    @Override
    public List<Linguagem> buscarLinguageId(Integer language_id) {
        return LinguagemMapper.mapToDomain(linguagemRespository.buscarLanguagePorCodigoId(language_id));
    }

    @Override
    public List<Linguagem> buscarLinguagemAll() {
        return LinguagemMapper.mapToDomain(linguagemRespository.findAll());
    }
}
