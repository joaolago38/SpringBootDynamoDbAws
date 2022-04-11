//package br.com.aws.dynamodb.usecase;
//
//import br.com.aws.dynamodb.exception.ErroNegocioMensagemException;
//import br.com.aws.dynamodb.model.CountryModel;
//import br.com.aws.dynamodb.port.BuscaDadosCountryPort;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static br.com.aws.dynamodb.ErrorMessage.E004;
//
//@Service
//@RequiredArgsConstructor
//public class CountryUseCase {
//    private BuscaDadosCountryPort buscaDadosCountryPort;
//
//    public List<CountryModel> buscaPorCityId(Long countryId) {
//        var countryRetorno = buscaDadosCountryPort.buscarCountryPorCodigoId(countryId);
//        if (countryRetorno.isEmpty()) {
//            throw new ErroNegocioMensagemException(
//                    E004.getCodigo(), E004.getMensagem(), new ArrayList<>());
//        }
//        return countryRetorno;
//
//    }
//}
