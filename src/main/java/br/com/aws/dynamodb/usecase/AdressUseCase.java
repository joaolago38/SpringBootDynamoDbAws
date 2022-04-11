package br.com.aws.dynamodb.usecase;


import br.com.aws.dynamodb.domain.Adress;
import br.com.aws.dynamodb.exception.ErroNegocioMensagemException;
import br.com.aws.dynamodb.port.BuscaDadosAdressPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static br.com.aws.dynamodb.message.ErrorMessage.E000;
import static br.com.aws.dynamodb.message.ErrorMessage.E001;

@Service
@RequiredArgsConstructor
public class AdressUseCase {

    private final BuscaDadosAdressPort buscaDadosAdressPort;

    public List<Adress> buscaPorAdressId(Integer addressId){
        var adressRetorno = buscaDadosAdressPort.buscarAdressPorCodigoId(addressId);
        if(adressRetorno.isEmpty()){
            throw new ErroNegocioMensagemException(
                    E000.getCodigo(), E000.getMensagem(), new ArrayList<>());
        }

        return adressRetorno;
    }

    public List<Adress> buscaPorAdressAll(){
        var adressRetorno = buscaDadosAdressPort.buscarActorPorCodigoAll();
        if(adressRetorno.isEmpty()){
            throw new ErroNegocioMensagemException(
                    E001.getCodigo(), E001.getMensagem(), new ArrayList<>());
        }

        return adressRetorno;
    }


}
