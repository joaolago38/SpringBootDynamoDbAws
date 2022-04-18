package br.com.aws.dynamodb.mapper;

import br.com.aws.dynamodb.domain.Aluguel;
import br.com.aws.dynamodb.domain.Armazenamento;
import br.com.aws.dynamodb.entinty.ArmazenamentoEntity;
import br.com.aws.dynamodb.response.AluguelResponse;
import br.com.aws.dynamodb.response.ArmazenamentoResponse;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.stream.Collectors;


@Mapper(componentModel = "spring")
public interface ArmazenamentoMapper {

    public static List<Armazenamento> mapToDomain(List<ArmazenamentoEntity> armazenamentoEntity){
        return armazenamentoEntity.stream().map(ArmazenamentoMapper::mapToDomain).collect(Collectors.toList());
    }


    public static Armazenamento mapToDomain(ArmazenamentoEntity armazenamentoEntity){
       return Armazenamento.builder().build();
    }



    public static List<ArmazenamentoResponse> mapToResponse(List<Armazenamento> armazenamento) {
        return armazenamento.stream().map(ArmazenamentoMapper::mapToResponse).collect(Collectors.toList());
    }

    public static ArmazenamentoResponse mapToResponse(Armazenamento armazenamento) {
        return ArmazenamentoResponse.builder().build();
    }


}