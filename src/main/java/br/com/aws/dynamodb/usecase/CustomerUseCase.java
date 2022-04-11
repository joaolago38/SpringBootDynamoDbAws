//package br.com.aws.dynamodb.usecase;
//
//
//import br.com.aws.dynamodb.exception.ErroNegocioMensagemException;
//import br.com.aws.dynamodb.model.CustomerModel;
//import br.com.aws.dynamodb.port.BuscaDadosCustomerPort;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static br.com.aws.dynamodb.ErrorMessage.E005;
//
//@Service
//@RequiredArgsConstructor
//public class CustomerUseCase {
//    private BuscaDadosCustomerPort buscaDadosCustomerPort;
//
//    public List<CustomerModel> buscaPorCustomerId(Long customerId) {
//        var customerRetorno = buscaDadosCustomerPort.buscarCustomerPorCodigoId(customerId);
//        if (customerRetorno.isEmpty()) {
//            throw new ErroNegocioMensagemException(
//                    E005.getCodigo(), E005.getMensagem(), new ArrayList<>());
//        }
//        return customerRetorno;
//
//    }
//}
