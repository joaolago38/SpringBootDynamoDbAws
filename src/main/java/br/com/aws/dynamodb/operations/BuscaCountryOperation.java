package br.com.aws.dynamodb.operations;

import br.com.aws.dynamodb.domain.City;
import br.com.aws.dynamodb.domain.Country;
import br.com.aws.dynamodb.mapper.CityMapper;
import br.com.aws.dynamodb.mapper.CountryMapper;
import br.com.aws.dynamodb.port.BuscaDadosCityPort;
import br.com.aws.dynamodb.port.BuscaDadosCountryPort;
import br.com.aws.dynamodb.repository.CityRepository;
import br.com.aws.dynamodb.repository.CountryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class BuscaCountryOperation implements BuscaDadosCountryPort {

    private final CountryRepository countryRepository;


    @Override
    public List<Country> buscarCountryPorCodigoId(Integer city_id) {
        return CountryMapper.mapToDomain(countryRepository.buscarCountryPorCodigoId(city_id));
    }

    @Override
    public List<Country> buscarCountryPorCodigoAll() {
        return CountryMapper.mapToDomain(countryRepository.findAll());
    }

}
