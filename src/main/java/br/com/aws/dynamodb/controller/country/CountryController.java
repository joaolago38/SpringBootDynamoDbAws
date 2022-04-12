package br.com.aws.dynamodb.controller.country;

import br.com.aws.dynamodb.mapper.CityMapper;
import br.com.aws.dynamodb.mapper.CountryMapper;
import br.com.aws.dynamodb.response.CityResponse;
import br.com.aws.dynamodb.response.CountryResponse;
import br.com.aws.dynamodb.usecase.CityUseCase;
import br.com.aws.dynamodb.usecase.CountryUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/buscarCountry")
public class CountryController {


    private final CountryUseCase countryUseCase;

    @GetMapping("/{countryId}/country")
    public ResponseEntity<List<CountryResponse>> consultarCityPorId( @PathVariable(name = "countryId")Integer countryId) {

        List<CountryResponse>  response = CountryMapper.mapToResponse(countryUseCase.buscaPorCountryId(countryId));
        return ResponseEntity.ok(response);


    }
}
