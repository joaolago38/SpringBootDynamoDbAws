package br.com.aws.dynamodb.controller.city;

import br.com.aws.dynamodb.mapper.CategoryMapper;
import br.com.aws.dynamodb.mapper.CityMapper;
import br.com.aws.dynamodb.response.CategoryResponse;
import br.com.aws.dynamodb.response.CityResponse;
import br.com.aws.dynamodb.usecase.CategoryUsecase;
import br.com.aws.dynamodb.usecase.CityUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/buscarCity")
public class CityController {

    private final CityUseCase cityUsecase;

    @GetMapping("/{city_id}/city")
    public ResponseEntity<List<CityResponse>> consultarCityPorCodigId(
            @PathVariable(name = "city_id")Integer city_id) {

        List<CityResponse>  response = CityMapper.mapToResponse(cityUsecase.buscaPorCityId(city_id));
        return ResponseEntity.ok(response);


    }
}
