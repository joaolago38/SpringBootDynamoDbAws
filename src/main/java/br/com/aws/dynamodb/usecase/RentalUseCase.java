//package br.com.aws.dynamodb.usecase;
//
//import br.com.aws.dynamodb.exception.ErroNegocioMensagemException;
//import br.com.aws.dynamodb.model.RentalModel;
//import br.com.aws.dynamodb.port.BuscaDadosRentalPort;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static br.com.aws.dynamodb.ErrorMessage.E0012;
//
//@Service
//@RequiredArgsConstructor
//public class RentalUseCase {
//
//    private BuscaDadosRentalPort buscaDadosRentalPort;
//
//    public List<RentalModel> buscaPorRentalId(Long rentalId) {
//        var rentalIdRetorno = buscaDadosRentalPort.buscarRentalPorCodigoId(rentalId);
//        if (rentalIdRetorno.isEmpty()) {
//            throw new ErroNegocioMensagemException(
//                    E0012.getCodigo(), E0012.getMensagem(), new ArrayList<>());
//        }
//        return rentalIdRetorno;
//
//    }
//}
