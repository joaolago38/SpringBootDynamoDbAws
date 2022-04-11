//package br.com.aws.dynamodb.usecase;
//
//import br.com.aws.dynamodb.exception.ErroNegocioMensagemException;
//import br.com.aws.dynamodb.model.StaffModel;
//import br.com.aws.dynamodb.port.BuscaDadosStaffPort;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static br.com.aws.dynamodb.ErrorMessage.E0013;
//
//@Service
//@RequiredArgsConstructor
//public class StaffUseCase {
//
//    private BuscaDadosStaffPort buscaDadosStaffPort;
//
//    public List<StaffModel> buscaPorStaffid(Long staffId) {
//        var staffIdRetorno = buscaDadosStaffPort.buscarStaffPorCodigoId(staffId);
//        if (staffIdRetorno.isEmpty()) {
//            throw new ErroNegocioMensagemException(
//                    E0013.getCodigo(), E0013.getMensagem(), new ArrayList<>());
//        }
//        return staffIdRetorno;
//
//    }
//}
