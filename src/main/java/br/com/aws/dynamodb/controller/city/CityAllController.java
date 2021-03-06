package br.com.aws.dynamodb.controller.city;

import br.com.aws.dynamodb.mapper.CityMapper;
import br.com.aws.dynamodb.response.CityResponse;
import br.com.aws.dynamodb.usecase.CityUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/buscarAllCity")
public class CityAllController {


    private final CityUseCase cityUsecase;

    @GetMapping()
    public ResponseEntity<List<CityResponse>> consultarCityPorAll( ) {

        List<CityResponse>  response = CityMapper.mapToResponse(cityUsecase.buscaPorCityAll());
        return ResponseEntity.ok(response);


    }
}
