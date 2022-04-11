//package br.com.aws.dynamodb.usecase;
//
//
//import br.com.aws.dynamodb.exception.ErroNegocioMensagemException;
//import br.com.aws.dynamodb.model.InventoryModel;
//import br.com.aws.dynamodb.port.BuscaDadosInventoryPort;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static br.com.aws.dynamodb.ErrorMessage.E009;
//
//@Service
//@RequiredArgsConstructor
//public class InventoryUseCase {
//    private BuscaDadosInventoryPort buscaDadosInventoryPort;
//
//    public List<InventoryModel> buscaPorInventoryId(Long inventoryId) {
//        var inventoryIdRetorno = buscaDadosInventoryPort.buscarFilmeActorPorCodigoId(inventoryId);
//        if (inventoryIdRetorno.isEmpty()) {
//            throw new ErroNegocioMensagemException(
//                    E009.getCodigo(), E009.getMensagem(), new ArrayList<>());
//        }
//        return inventoryIdRetorno;
//
//    }
//}
