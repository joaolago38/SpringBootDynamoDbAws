package br.com.aws.dynamodb.mapper;

import br.com.aws.dynamodb.domain.Linguagem;
import br.com.aws.dynamodb.entinty.LinguagemEntity;
import br.com.aws.dynamodb.response.LinguagemResponse;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.stream.Collectors;


@Mapper(componentModel = "spring")
public interface LinguagemMapper {

    public static List<Linguagem> mapToDomain(List<LinguagemEntity> linguagemEntity){
        return linguagemEntity.stream().map(LinguagemMapper::mapToDomain).collect(Collectors.toList());
    }


    public static Linguagem mapToDomain(LinguagemEntity linguagemEntity){
       return Linguagem.builder().language_id(linguagemEntity.getLanguageId()).last_update(linguagemEntity.getLastUpdate()).name(linguagemEntity.getName()).build();
    }



    public static List<LinguagemResponse> mapToResponse(List<Linguagem> linguagem) {
        return linguagem.stream().map(LinguagemMapper::mapToResponse).collect(Collectors.toList());
    }

    public static LinguagemResponse mapToResponse(Linguagem linguagem) {
        return LinguagemResponse.builder().languageId(linguagem.getLanguage_id()).lastUpdate(linguagem.getLast_update()).name(linguagem.getName()).build();
    }


}