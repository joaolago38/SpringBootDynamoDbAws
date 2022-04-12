package br.com.aws.dynamodb.mapper;

import br.com.aws.dynamodb.domain.City;
import br.com.aws.dynamodb.entinty.CityEntity;
import br.com.aws.dynamodb.response.CityResponse;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.stream.Collectors;


@Mapper(componentModel = "spring")
public interface CityMapper {


    public static City mapToDomain(CityEntity cityEntity){
       return City.builder().city_id(cityEntity.getCity_id()).country_id(cityEntity.getCountryId()).last_update(cityEntity.getLastUpdate()).build();
    }

    public static List<City> mapToDomain(List<CityEntity> cityEntity){
        return cityEntity.stream().map(CityMapper::mapToDomain).collect(Collectors.toList());
    }


    public static List<CityResponse> mapToResponse(List<City>city) {
        return city.stream().map(CityMapper::mapToResponse).collect(Collectors.toList());
    }

    public static CityResponse mapToResponse(City city) {
        return CityResponse.builder().city_id(city.getCity_id()).countryId(city.getCountry_id()).lastUpdate(city.getLast_update()).build();
    }


}
