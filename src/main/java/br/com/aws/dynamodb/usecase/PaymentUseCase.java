package br.com.aws.dynamodb.usecase;

import br.com.aws.dynamodb.exception.ErroNegocioMensagemException;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service
@RequiredArgsConstructor
public class PaymentUseCase {
//    private BuscaDadosPaymentPort buscaDadosPaymentPort;

//    public List<PaymentModel> buscaPorPaymentId(Long paymentId) {
//        var paymentlanguageIdRetorno = buscaDadosPaymentPort.buscarPaymentPorCodigoId(paymentId);
//        if (paymentlanguageIdRetorno.isEmpty()) {
//            throw new ErroNegocioMensagemException(
//                    E0011.getCodigo(), E0011.getMensagem(), new ArrayList<>());
//        }
//        return paymentlanguageIdRetorno;
//
//    }
}
