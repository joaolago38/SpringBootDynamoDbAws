package br.com.aws.dynamodb.usecase;

import br.com.aws.dynamodb.domain.Aluguel;
import br.com.aws.dynamodb.domain.Armazenamento;
import br.com.aws.dynamodb.entinty.ArmazenamentoEntity;
import br.com.aws.dynamodb.exception.ErroNegocioMensagemException;
import br.com.aws.dynamodb.port.BuscaDadosAluguelPort;
import br.com.aws.dynamodb.port.BuscaDadosArmazenamentoPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static br.com.aws.dynamodb.message.ErrorMessage.E0012;
import static br.com.aws.dynamodb.message.ErrorMessage.E0014;


@Service
@RequiredArgsConstructor
public class ArmazenamentoUseCase {

    private final BuscaDadosArmazenamentoPort buscaDadosArmazenamentoPort;

    public List<Armazenamento> buscaPorArmazenamentoId(Integer store_id) {
        var armazenamentoIdRetorno = buscaDadosArmazenamentoPort.buscarArmazenamentoPorCodigoId(store_id);
        if (armazenamentoIdRetorno.isEmpty()) {
            throw new ErroNegocioMensagemException(
                    E0014.getCodigo(), E0014.getMensagem(), new ArrayList<>());
        }
        return armazenamentoIdRetorno;

    }

    public List<Armazenamento> buscaPorArmazenamentolAll(){
        var armazenamentoIdRetorno = buscaDadosArmazenamentoPort.buscarArmazenamentoPorCodigoAll();
        if(armazenamentoIdRetorno.isEmpty()){
            throw new ErroNegocioMensagemException(
                    E0014.getCodigo(), E0014.getMensagem(), new ArrayList<>());
        }

        return armazenamentoIdRetorno;
    }
}
