package br.com.aws.dynamodb.mapper;

import br.com.aws.dynamodb.domain.Pagamento;
import br.com.aws.dynamodb.domain.Pessoa;
import br.com.aws.dynamodb.entinty.PagamentoEntity;
import br.com.aws.dynamodb.entinty.PessoaEntity;
import br.com.aws.dynamodb.response.PagamentoResponse;
import br.com.aws.dynamodb.response.PessoaResponse;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.stream.Collectors;


@Mapper(componentModel = "spring")
public interface PessoaMapper {

    public static List<Pessoa> mapToDomain(List<PessoaEntity> pessoaEntity){
        return pessoaEntity.stream().map(PessoaMapper::mapToDomain).collect(Collectors.toList());
    }


    public static Pessoa mapToDomain(PessoaEntity pessoaEntity){
       return Pessoa.builder().staff_id(pessoaEntity.getStaffId()).active(pessoaEntity.getActive()).address_id(pessoaEntity.getAddressId()).email(pessoaEntity.getEmail()).first_name(pessoaEntity.getFirstName()).last_update(pessoaEntity.getLastUpdate()).address_id(pessoaEntity.getAddressId())
               .password(pessoaEntity.getPassword()).picture(pessoaEntity.getPicture())
               .username(pessoaEntity.getUsername()).build();
    }



    public static List<PessoaResponse> mapToResponse(List<Pessoa> pessoa) {
        return pessoa.stream().map(PessoaMapper::mapToResponse).collect(Collectors.toList());
    }

    public static PessoaResponse mapToResponse(Pessoa pessoa) {
        return PessoaResponse.builder().addressId(pessoa.getAddress_id()).firstName(pessoa.getFirst_name())
                .lastName(pessoa.getLast_name()).active(pessoa.getActive()).email(pessoa.getEmail())
                .password(pessoa.getPassword()).picture(pessoa.getPicture()).storeId(pessoa.getStore_id())
                .username(pessoa.getUsername()).staff_id(pessoa.getStaff_id()).build();
    }


}