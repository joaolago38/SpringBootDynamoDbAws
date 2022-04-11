//package br.com.aws.dynamodb.usecase;
//
//
//import br.com.aws.dynamodb.exception.ErroNegocioMensagemException;
//import br.com.aws.dynamodb.model.LanguageModel;
//import br.com.aws.dynamodb.port.BuscaDadosLanguagePort;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static br.com.aws.dynamodb.ErrorMessage.E0010;
//
//@Service
//@RequiredArgsConstructor
//public class LanguageUseCase {
//    private BuscaDadosLanguagePort buscaDadosLanguagePort;
//
//    public List<LanguageModel> buscaPorLanguageId(Long languageId) {
//        var languageIdRetorno = buscaDadosLanguagePort.buscarLanguagePorCodigoId(languageId);
//        if (languageIdRetorno.isEmpty()) {
//            throw new ErroNegocioMensagemException(
//                    E0010.getCodigo(), E0010.getMensagem(), new ArrayList<>());
//        }
//        return languageIdRetorno;
//
//    }
//}
