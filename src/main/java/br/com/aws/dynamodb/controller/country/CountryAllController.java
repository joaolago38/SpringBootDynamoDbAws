package br.com.aws.dynamodb.controller.country;

import br.com.aws.dynamodb.mapper.CountryMapper;
import br.com.aws.dynamodb.response.CountryResponse;
import br.com.aws.dynamodb.usecase.CountryUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/buscarAllCountry")
public class CountryAllController {


    private final CountryUseCase countryUsecase;

    @GetMapping()
    public ResponseEntity<List<CountryResponse>> consultarCityPorAll( ) {

        List<CountryResponse>  response = CountryMapper.mapToResponse(countryUsecase.buscaCountryAll());
        return ResponseEntity.ok(response);


    }
}
