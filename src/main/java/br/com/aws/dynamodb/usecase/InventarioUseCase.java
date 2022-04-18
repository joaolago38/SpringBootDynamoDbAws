package br.com.aws.dynamodb.usecase;

import br.com.aws.dynamodb.domain.Inventario;
import br.com.aws.dynamodb.exception.ErroNegocioMensagemException;
import br.com.aws.dynamodb.port.BuscaDadosInventarioPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static br.com.aws.dynamodb.message.ErrorMessage.E009;

@Service
@RequiredArgsConstructor
public class InventarioUseCase {
    private final BuscaDadosInventarioPort buscaDadosInventarioPort;

    public List<Inventario> buscaPorInventoryId(Integer inventoryId) {
        var inventarioIdRetorno = buscaDadosInventarioPort.buscarInventarioId(inventoryId);
        if (inventarioIdRetorno.isEmpty()) {
            throw new ErroNegocioMensagemException(
                    E009.getCodigo(), E009.getMensagem(), new ArrayList<>());
        }
        return inventarioIdRetorno;

    }


    public List<Inventario> buscaInvetarioAll(){
        var inventarioIdRetorno = buscaDadosInventarioPort.buscarInventarioPorCodigoAll();
        if(inventarioIdRetorno.isEmpty()){
            throw new ErroNegocioMensagemException(
                    E009.getCodigo(), E009.getMensagem(), new ArrayList<>());
        }

        return inventarioIdRetorno;
    }
}
