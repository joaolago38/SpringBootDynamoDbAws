//package br.com.aws.dynamodb.usecase;
//
//
//import br.com.aws.dynamodb.exception.ErroNegocioMensagemException;
//import br.com.aws.dynamodb.model.FilmeCategoryModel;
//import br.com.aws.dynamodb.port.BuscaDadosFilmeCategoryPort;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static br.com.aws.dynamodb.ErrorMessage.E007;
//
//@Service
//@RequiredArgsConstructor
//public class FilmeCategoryUseCase {
//
//    private BuscaDadosFilmeCategoryPort buscaDadosFilmeCategoryPort;
//
//    public List<FilmeCategoryModel> buscaPorFilmeCategoryId(Long filmeActorId) {
//        var filmeCategoryIdRetorno = buscaDadosFilmeCategoryPort.buscarilmeCategoryPorCodigoId(filmeActorId);
//        if (filmeCategoryIdRetorno.isEmpty()) {
//            throw new ErroNegocioMensagemException(
//                    E007.getCodigo(), E007.getMensagem(), new ArrayList<>());
//        }
//        return filmeCategoryIdRetorno;
//
//    }
//}
