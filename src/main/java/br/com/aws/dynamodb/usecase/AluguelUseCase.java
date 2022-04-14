package br.com.aws.dynamodb.usecase;

import br.com.aws.dynamodb.domain.Adress;
import br.com.aws.dynamodb.domain.Aluguel;
import br.com.aws.dynamodb.exception.ErroNegocioMensagemException;

import br.com.aws.dynamodb.port.BuscaDadosAluguelPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static br.com.aws.dynamodb.message.ErrorMessage.E001;
import static br.com.aws.dynamodb.message.ErrorMessage.E0012;


@Service
@RequiredArgsConstructor
public class AluguelUseCase {

    private final BuscaDadosAluguelPort buscaDadosAluguelPort;

    public List<Aluguel> buscaPorRentalId(Integer rental_id) {
        var aluguelIdRetorno = buscaDadosAluguelPort.buscarAlugelPorCodigoId(rental_id);
        if (aluguelIdRetorno.isEmpty()) {
            throw new ErroNegocioMensagemException(
                    E0012.getCodigo(), E0012.getMensagem(), new ArrayList<>());
        }
        return aluguelIdRetorno;

    }

    public List<Aluguel> buscaPorAluguelAll(){
        var aluguelIdRetorno = buscaDadosAluguelPort.buscarAlugelPorCodigoAll();
        if(aluguelIdRetorno.isEmpty()){
            throw new ErroNegocioMensagemException(
                    E0012.getCodigo(), E0012.getMensagem(), new ArrayList<>());
        }

        return aluguelIdRetorno;
    }
}
