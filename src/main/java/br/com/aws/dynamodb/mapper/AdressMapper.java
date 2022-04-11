package br.com.aws.dynamodb.mapper;

import br.com.aws.dynamodb.domain.Actor;
import br.com.aws.dynamodb.domain.Adress;
import br.com.aws.dynamodb.entinty.AdressEntity;
import br.com.aws.dynamodb.response.AdressResponse;
import org.jetbrains.annotations.NotNull;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.stream.Collectors;


@Mapper(componentModel = "spring")
public interface AdressMapper {

    Actor toModel(AdressEntity model);

    public static Adress mapToDomain(@NotNull AdressEntity adressEntity){
        return  Adress.builder().address(adressEntity.getAddress())
                .address2(adressEntity.getAddress2()).addressId(adressEntity.getAddressId())
                .district(adressEntity.getDistrict()).last_update(adressEntity.getLastUpdate())
                .district(adressEntity.getDistrict()).city_id(adressEntity.getCityId())
                .phone(adressEntity.getPhone()).postal_code(adressEntity.getPostalCode()).build();
    }

    public static List<Adress> mapToDomain(List<AdressEntity> adressEntity){
        return adressEntity.stream().map(AdressMapper::mapToDomain).collect(Collectors.toList());
    }


    public static List<AdressResponse> mapToResponse(List<Adress> adress) {
        return adress.stream().map(AdressMapper::mapToResponse).collect(Collectors.toList());
    }

    public static AdressResponse mapToResponse(Adress adress) {
        return AdressResponse.builder().address2(adress.getAddress2()).addressId(adress.getAddressId()).cityId(adress.getCity_id()).lastUpdate(adress.getLast_update()).phone(adress.getPhone()).postalCode(adress.getPostal_code()).build();
    }


}
