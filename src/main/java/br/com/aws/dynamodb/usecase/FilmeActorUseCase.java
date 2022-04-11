//package br.com.aws.dynamodb.usecase;
//
//import br.com.aws.dynamodb.exception.ErroNegocioMensagemException;
//import br.com.aws.dynamodb.model.FilmeActorModel;
//import br.com.aws.dynamodb.port.BuscaDadosFilmeActorPort;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static br.com.aws.dynamodb.ErrorMessage.E006;
//
//@Service
//@RequiredArgsConstructor
//public class FilmeActorUseCase {
//    private BuscaDadosFilmeActorPort buscaDadosCustomerPort;
//
//    public List<FilmeActorModel> buscaPorFilmeActorId(Long filmeActorId) {
//        var filmeActorIdRetorno = buscaDadosCustomerPort.buscarFilmeActorPorCodigoId(filmeActorId);
//        if (filmeActorIdRetorno.isEmpty()) {
//            throw new ErroNegocioMensagemException(
//                    E006.getCodigo(), E006.getMensagem(), new ArrayList<>());
//        }
//        return filmeActorIdRetorno;
//
//    }
//}
