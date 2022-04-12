package br.com.aws.dynamodb.mapper;

import br.com.aws.dynamodb.domain.Country;
import br.com.aws.dynamodb.entinty.CountryEntity;
import br.com.aws.dynamodb.response.CountryResponse;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.stream.Collectors;


@Mapper(componentModel = "spring")
public interface CountryMapper {


    public static Country mapToDomain(CountryEntity countryEntity){
       return Country.builder().country_id(countryEntity.getCountryId()).build();
    }

    public static List<Country> mapToDomain(List<CountryEntity> countryEntity){
        return countryEntity.stream().map(CountryMapper::mapToDomain).collect(Collectors.toList());
    }


    public static List<CountryResponse> mapToResponse(List<Country>country) {
        return country.stream().map(CountryMapper::mapToResponse).collect(Collectors.toList());
    }

    public static CountryResponse mapToResponse(Country country) {
        return CountryResponse.builder().countryId(country.getCountry_id()).countryId(country.getCountry_id()).lastUpdate(country.getLast_update()).build();
    }


}
