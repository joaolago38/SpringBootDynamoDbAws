package br.com.aws.dynamodb.usecase;


import br.com.aws.dynamodb.domain.Customer;
import br.com.aws.dynamodb.exception.ErroNegocioMensagemException;

import br.com.aws.dynamodb.port.BuscaDadosCustomerPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static br.com.aws.dynamodb.message.ErrorMessage.*;


@Service
@RequiredArgsConstructor
public class CustomerUseCase {

    private final BuscaDadosCustomerPort buscaDadosCustomerPort;

    public List<Customer> buscaPorCustomerId(Integer customerId) {
        var customerRetorno = buscaDadosCustomerPort.buscarCustomerPorCodigoId(customerId);
        if (customerRetorno.isEmpty()) {
            throw new ErroNegocioMensagemException(
                    E005.getCodigo(), E005.getMensagem(), new ArrayList<>());
        }
        return customerRetorno;

    }

    public List<Customer> buscaCustomerAll(){
        var customerRetorno = buscaDadosCustomerPort.buscarCustomerPorCodigoAll();
        if(customerRetorno.isEmpty()){
            throw new ErroNegocioMensagemException(
                    E003.getCodigo(), E001.getMensagem(), new ArrayList<>());
        }

        return customerRetorno;
    }
}
