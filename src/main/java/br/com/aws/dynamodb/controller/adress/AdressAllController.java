package br.com.aws.dynamodb.controller.adress;

import br.com.aws.dynamodb.mapper.AdressMapper;
import br.com.aws.dynamodb.response.AdressResponse;
import br.com.aws.dynamodb.usecase.AdressUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/buscarAdress")
public class AdressAllController {


    private final AdressUseCase adressUseCase;

    @GetMapping()
    public ResponseEntity<List<AdressResponse>> consultarAdressPorAll( ) {

        List<AdressResponse>  response = AdressMapper.mapToResponse(adressUseCase.buscaPorAdressAll());
        return ResponseEntity.ok(response);


    }
}
