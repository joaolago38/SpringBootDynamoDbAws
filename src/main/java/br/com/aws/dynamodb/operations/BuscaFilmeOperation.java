package br.com.aws.dynamodb.operations;

import br.com.aws.dynamodb.domain.FilmeCategoria;
import br.com.aws.dynamodb.mapper.FilmeCategoriaMapper;
import br.com.aws.dynamodb.port.BuscaDadosFilmeCategoriaPort;
import br.com.aws.dynamodb.repository.FilmeCategoryRespository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class BuscaFilmeOperation implements BuscaDadosFilmeCategoriaPort {

    private final FilmeCategoryRespository filmeCategoryRespository;


    @Override
    public List<FilmeCategoria> buscarFilmeCategoriaPorCodigoId(Integer category_id) {
        return FilmeCategoriaMapper.mapToDomain(filmeCategoryRespository.buscarFilmeCategoriaPorCodigoId(category_id));
    }

    @Override
    public List<FilmeCategoria> buscarFilmeCategoriaPorCodigoAll() {
        return FilmeCategoriaMapper.mapToDomain(filmeCategoryRespository.findAll());
    }

}
