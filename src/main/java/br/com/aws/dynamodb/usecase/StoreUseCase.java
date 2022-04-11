//package br.com.aws.dynamodb.usecase;
//
//import br.com.aws.dynamodb.exception.ErroNegocioMensagemException;
//import br.com.aws.dynamodb.model.StoreModel;
//import br.com.aws.dynamodb.port.BuscaDadosStorePort;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static br.com.aws.dynamodb.ErrorMessage.E0014;
//
//@Service
//@RequiredArgsConstructor
//public class StoreUseCase {
//
//    private BuscaDadosStorePort buscaDadosStorePort;
//
//    public List<StoreModel> buscaPorStoredid(Long storeId) {
//        var storeIdRetorno = buscaDadosStorePort.buscarStorePorCodigoId(storeId);
//        if (storeIdRetorno.isEmpty()) {
//            throw new ErroNegocioMensagemException(
//                    E0014.getCodigo(), E0014.getMensagem(), new ArrayList<>());
//        }
//        return storeIdRetorno;
//
//    }
//}
