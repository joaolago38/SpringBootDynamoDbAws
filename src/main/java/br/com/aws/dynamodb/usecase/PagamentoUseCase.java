package br.com.aws.dynamodb.usecase;

import br.com.aws.dynamodb.domain.Pagamento;
import br.com.aws.dynamodb.exception.ErroNegocioMensagemException;
import br.com.aws.dynamodb.port.BuscaDadosPagamentoPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static br.com.aws.dynamodb.message.ErrorMessage.E0011;


@Service
@RequiredArgsConstructor
public class PagamentoUseCase {

    private final BuscaDadosPagamentoPort buscaDadosPagamentoPort;

    public List<Pagamento> buscaPorPagamentoId(Integer payment_id) {
        var pagamentoRetornoId = buscaDadosPagamentoPort.buscarPagamentoId(payment_id);
        if (pagamentoRetornoId.isEmpty()) {
            throw new ErroNegocioMensagemException(
                    E0011.getCodigo(), E0011.getMensagem(), new ArrayList<>());
        }
        return pagamentoRetornoId;

    }

    public List<Pagamento> buscaPagamentoFindAll(){
        var pagamentoRetornoId = buscaDadosPagamentoPort.buscarPagamentoAll();
        if(pagamentoRetornoId.isEmpty()){
            throw new ErroNegocioMensagemException(
                    E0011.getCodigo(), E0011.getMensagem(), new ArrayList<>());
        }

        return pagamentoRetornoId;
    }
}
