package br.com.aws.dynamodb.usecase;

import br.com.aws.dynamodb.domain.City;
import br.com.aws.dynamodb.domain.Country;
import br.com.aws.dynamodb.exception.ErroNegocioMensagemException;
;
import br.com.aws.dynamodb.port.BuscaDadosCountryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static br.com.aws.dynamodb.message.ErrorMessage.*;


@Service
@RequiredArgsConstructor
public class CountryUseCase {
    private final BuscaDadosCountryPort buscaDadosCountryPort;

    public List<Country> buscaPorCountryId(Integer country_id) {
        var countryRetorno = buscaDadosCountryPort.buscarCountryPorCodigoId(country_id);
        if (countryRetorno.isEmpty()) {
            throw new ErroNegocioMensagemException(
                    E004.getCodigo(), E004.getMensagem(), new ArrayList<>());
        }
        return countryRetorno;

    }

    public List<Country> buscaCountryAll(){
        var countryRetorno = buscaDadosCountryPort.buscarCountryPorCodigoAll();
        if(countryRetorno.isEmpty()){
            throw new ErroNegocioMensagemException(
                    E003.getCodigo(), E001.getMensagem(), new ArrayList<>());
        }

        return countryRetorno;
    }


}
