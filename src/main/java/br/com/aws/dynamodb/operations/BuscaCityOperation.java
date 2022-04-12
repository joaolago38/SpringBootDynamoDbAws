package br.com.aws.dynamodb.operations;

import br.com.aws.dynamodb.domain.City;
import br.com.aws.dynamodb.mapper.CityMapper;
import br.com.aws.dynamodb.port.BuscaDadosCityPort;
import br.com.aws.dynamodb.repository.CityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class BuscaCityOperation implements BuscaDadosCityPort {

    private final CityRepository cityRepository;


    @Override
    public List<City> buscarCityPorCodigoId(Integer city_id) {
        return CityMapper.mapToDomain(cityRepository.buscarCityPorCodigoId(city_id));
    }

    @Override
    public List<City> buscarCityPorCodigoAll() {
        return CityMapper.mapToDomain(cityRepository.findAll());
    }

}
