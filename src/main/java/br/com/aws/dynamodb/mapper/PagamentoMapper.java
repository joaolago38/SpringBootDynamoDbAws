package br.com.aws.dynamodb.mapper;

import br.com.aws.dynamodb.domain.Pagamento;
import br.com.aws.dynamodb.entinty.PagamentoEntity;
import br.com.aws.dynamodb.response.PagamentoResponse;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.stream.Collectors;


@Mapper(componentModel = "spring")
public interface PagamentoMapper {

    public static List<Pagamento> mapToDomain(List<PagamentoEntity> pagamentoEntity){
        return pagamentoEntity.stream().map(PagamentoMapper::mapToDomain).collect(Collectors.toList());
    }


    public static Pagamento mapToDomain(PagamentoEntity pagamentoEntity){
       return Pagamento.builder().amount(pagamentoEntity.getAmount()).customer_id(pagamentoEntity
               .getCustomerId()).payment_date(pagamentoEntity.getPaymentDate()).rental_id(pagamentoEntity
               .getRentalId()).staff_id(pagamentoEntity.getStaffId()).build();
    }



    public static List<PagamentoResponse> mapToResponse(List<Pagamento> pagamento) {
        return pagamento.stream().map(PagamentoMapper::mapToResponse).collect(Collectors.toList());
    }

    public static PagamentoResponse mapToResponse(Pagamento pagamento) {
        return PagamentoResponse.builder().customerId(pagamento.getCustomer_id())
                .paymentDate(pagamento.getPayment_date()).paymentId(pagamento.getCustomer_id())
                .rentalId(pagamento.getRental_id()).staffId(pagamento.getStaff_id()).amount(pagamento.getAmount()).build();
    }


}