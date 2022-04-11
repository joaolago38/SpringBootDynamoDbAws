package br.com.aws.dynamodb.controller.adress;

import br.com.aws.dynamodb.mapper.ActorMapper;
import br.com.aws.dynamodb.mapper.AdressMapper;
import br.com.aws.dynamodb.response.ActorResponse;
import br.com.aws.dynamodb.response.AdressResponse;
import br.com.aws.dynamodb.usecase.ActorUseCase;
import br.com.aws.dynamodb.usecase.AdressUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/buscarAdress")
public class AdressController {
    private final AdressUseCase adressUseCase;

    @GetMapping("/{endereco_id}/adress")
    public ResponseEntity<List<AdressResponse>> consultarActorPorCodigId(
            @PathVariable(name = "endereco_id")Integer categoryId) {

        List<AdressResponse>  response = AdressMapper.mapToResponse(adressUseCase.buscaPorAdressId(categoryId));
        return ResponseEntity.ok(response);


    }
}
