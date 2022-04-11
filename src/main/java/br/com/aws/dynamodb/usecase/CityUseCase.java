//package br.com.aws.dynamodb.usecase;
//
//import br.com.aws.dynamodb.exception.ErroNegocioMensagemException;
//import br.com.aws.dynamodb.model.CityModel;
//import br.com.aws.dynamodb.port.BuscaDadosCityPort;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static br.com.aws.dynamodb.ErrorMessage.E003;
//
//@Service
//@RequiredArgsConstructor
//public class CityUseCase {
//    private BuscaDadosCityPort buscaDadosCityPort;
//
//    public List<CityModel> buscaPorCityId(Long cityId) {
//        var cityRetorno = buscaDadosCityPort.buscarCityPorCodigoId(cityId);
//        if (cityRetorno.isEmpty()) {
//            throw new ErroNegocioMensagemException(
//                    E003.getCodigo(), E003.getMensagem(), new ArrayList<>());
//        }
//        return cityRetorno;
//
//    }
//}
