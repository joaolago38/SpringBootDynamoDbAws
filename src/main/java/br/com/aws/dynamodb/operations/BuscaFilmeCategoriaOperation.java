package br.com.aws.dynamodb.operations;

import br.com.aws.dynamodb.domain.Filme;
import br.com.aws.dynamodb.mapper.FilmeMapper;
import br.com.aws.dynamodb.port.BuscaDadosFilmePort;
import br.com.aws.dynamodb.repository.FilmesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class BuscaFilmeCategoriaOperation implements BuscaDadosFilmePort {

    private final FilmesRepository filmeRespository;




    @Override
    public List<Filme> buscarFilmePorCodigoId(Integer filmeId) {
        return FilmeMapper.mapToDomain(filmeRespository.buscarFilmePorCodigoId(filmeId));
    }

    @Override
    public List<Filme> buscarFilmePorCodigoAll() {
        return FilmeMapper.mapToDomain(filmeRespository.findAll());
    }
}
