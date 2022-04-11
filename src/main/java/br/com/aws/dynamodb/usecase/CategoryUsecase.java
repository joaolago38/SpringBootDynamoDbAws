package br.com.aws.dynamodb.usecase;

import br.com.aws.dynamodb.domain.Adress;
import br.com.aws.dynamodb.domain.Category;
import br.com.aws.dynamodb.exception.ErroNegocioMensagemException;
import br.com.aws.dynamodb.port.BuscaDadosCategoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static br.com.aws.dynamodb.message.ErrorMessage.E001;
import static br.com.aws.dynamodb.message.ErrorMessage.E002;


@Service
@RequiredArgsConstructor
public class CategoryUsecase {

    private final BuscaDadosCategoryPort buscaDadosCategoryPort;

    public List<Category> buscaPorCateroyId(Integer categoryId){
        var categoryRetorno = buscaDadosCategoryPort.buscarCategoryPorCodigoId(categoryId);
        if(categoryRetorno.isEmpty()){
            throw new ErroNegocioMensagemException(
                    E002.getCodigo(), E002.getMensagem(), new ArrayList<>());
        }
        return categoryRetorno;

    }

    public List<Category> buscaPorCategoryAll(){
        var categoryRetorno = buscaDadosCategoryPort.buscarCategoryPorCodigoAll();
        if(categoryRetorno.isEmpty()){
            throw new ErroNegocioMensagemException(
                    E001.getCodigo(), E001.getMensagem(), new ArrayList<>());
        }

        return categoryRetorno;
    }
}
