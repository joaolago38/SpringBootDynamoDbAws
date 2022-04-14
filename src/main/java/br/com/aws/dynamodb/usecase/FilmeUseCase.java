package br.com.aws.dynamodb.usecase;


import br.com.aws.dynamodb.domain.Filme;
import br.com.aws.dynamodb.exception.ErroNegocioMensagemException;
import br.com.aws.dynamodb.port.BuscaDadosFilmePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static br.com.aws.dynamodb.message.ErrorMessage.*;


@Service
@RequiredArgsConstructor
public class FilmeUseCase {

       private final BuscaDadosFilmePort buscaDadosFilmePort;

    public List<Filme> buscaPorFilmeId(Integer filmeId) {
        var filme = buscaDadosFilmePort.buscarFilmePorCodigoId(filmeId);
        if (filme.isEmpty()) {
            throw new ErroNegocioMensagemException(
                    E008.getCodigo(), E008.getMensagem(), new ArrayList<>());
        }
        return filme;

    }

    public List<Filme> buscaFilmeAll(){
        var filme = buscaDadosFilmePort.buscarFilmePorCodigoAll();
        if(filme.isEmpty()){
            throw new ErroNegocioMensagemException(
                    E007.getCodigo(), E001.getMensagem(), new ArrayList<>());
        }

        return filme;
    }

}
