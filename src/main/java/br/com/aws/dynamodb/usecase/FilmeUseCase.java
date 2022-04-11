package br.com.aws.dynamodb.usecase;


import br.com.aws.dynamodb.exception.ErroNegocioMensagemException;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service
@RequiredArgsConstructor
public class FilmeUseCase {


//    public List<FilmeModel> buscaPorFilmeCategoryId(Long filmeId) {
//        var filmeCategoryIdRetorno = buscaDadosFilmePort.buscarFilmeCodigoId(filmeId);
//        if (filmeCategoryIdRetorno.isEmpty()) {
//            throw new ErroNegocioMensagemException(
//                    E008.getCodigo(), E008.getMensagem(), new ArrayList<>());
//        }
//        return filmeCategoryIdRetorno;
//
//    }  private BuscaDadosFilmPort buscaDadosFilmePort;

}
