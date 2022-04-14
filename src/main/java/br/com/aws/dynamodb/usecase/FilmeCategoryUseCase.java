package br.com.aws.dynamodb.usecase;


import br.com.aws.dynamodb.domain.FilmeActor;
import br.com.aws.dynamodb.domain.FilmeCategoria;
import br.com.aws.dynamodb.exception.ErroNegocioMensagemException;
import br.com.aws.dynamodb.port.BuscaDadosFilmeCategoriaPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static br.com.aws.dynamodb.message.ErrorMessage.*;


@Service
@RequiredArgsConstructor
public class FilmeCategoryUseCase {

    private final BuscaDadosFilmeCategoriaPort buscaDadosFilmeCategoriaPort;

    public List<FilmeCategoria> buscaPorFilmeCategoryId(Integer category_id) {
        var filmeCategoriaIdRetorno = buscaDadosFilmeCategoriaPort.buscarFilmeCategoriaPorCodigoId(category_id);
        if (filmeCategoriaIdRetorno.isEmpty()) {
            throw new ErroNegocioMensagemException(
                    E007.getCodigo(), E007.getMensagem(), new ArrayList<>());
        }
        return filmeCategoriaIdRetorno;

    }

    public List<FilmeCategoria> buscaCategoriaAtorAll(){
        var filmeCategoriaRetorno = buscaDadosFilmeCategoriaPort.buscarFilmeCategoriaPorCodigoAll();
        if(filmeCategoriaRetorno.isEmpty()){
            throw new ErroNegocioMensagemException(
                    E007.getCodigo(), E001.getMensagem(), new ArrayList<>());
        }

        return filmeCategoriaRetorno;
    }
}
