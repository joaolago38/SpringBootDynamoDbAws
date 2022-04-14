package br.com.aws.dynamodb.mapper;

import br.com.aws.dynamodb.domain.Aluguel;
import br.com.aws.dynamodb.domain.Filme;
import br.com.aws.dynamodb.entinty.AluguelEntity;
import br.com.aws.dynamodb.entinty.FilmesEntity;
import br.com.aws.dynamodb.response.AluguelResponse;
import br.com.aws.dynamodb.response.FilmeResponse;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.stream.Collectors;


@Mapper(componentModel = "spring")
public interface AluguelMapper {

    public static List<Aluguel> mapToDomain(List<AluguelEntity> aluguelEntity){
        return aluguelEntity.stream().map(AluguelMapper::mapToDomain).collect(Collectors.toList());
    }


    public static Aluguel mapToDomain(AluguelEntity aluguelEntity){
       return Aluguel.builder().rental_id(aluguelEntity.getRentalId()).rental_date(aluguelEntity.getRentalDate()).return_date(aluguelEntity.getReturnDate()).customer_id(aluguelEntity.getCustomerId()).inventory_id(aluguelEntity.getInventoryId()).last_update(aluguelEntity.getLastUpdate()).staff_id(aluguelEntity.getStaffId()).build();
    }



    public static List<AluguelResponse> mapToResponse(List<Aluguel> aluguel) {
        return aluguel.stream().map(AluguelMapper::mapToResponse).collect(Collectors.toList());
    }

    public static AluguelResponse mapToResponse(Aluguel aluguel) {
        return AluguelResponse.builder().build();
    }


}