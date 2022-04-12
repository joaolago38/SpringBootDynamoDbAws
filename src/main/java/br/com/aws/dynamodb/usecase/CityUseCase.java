package br.com.aws.dynamodb.usecase;

import br.com.aws.dynamodb.domain.City;
import br.com.aws.dynamodb.exception.ErroNegocioMensagemException;
import br.com.aws.dynamodb.port.BuscaDadosCityPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static br.com.aws.dynamodb.message.ErrorMessage.E001;
import static br.com.aws.dynamodb.message.ErrorMessage.E003;


@Service
@RequiredArgsConstructor
public class CityUseCase {

    private final BuscaDadosCityPort buscaDadosCityPort;

    public List<City> buscaPorCityId(Integer cityId) {
        var cityRetorno = buscaDadosCityPort.buscarCityPorCodigoId(cityId);
        if (cityRetorno.isEmpty()) {
            throw new ErroNegocioMensagemException(
                    E003.getCodigo(), E003.getMensagem(), new ArrayList<>());
        }
        return cityRetorno;

    }

    public List<City> buscaPorCityAll(){
        var cityRetorno = buscaDadosCityPort.buscarCityPorCodigoAll();
        if(cityRetorno.isEmpty()){
            throw new ErroNegocioMensagemException(
                    E003.getCodigo(), E001.getMensagem(), new ArrayList<>());
        }

        return cityRetorno;
    }
}
