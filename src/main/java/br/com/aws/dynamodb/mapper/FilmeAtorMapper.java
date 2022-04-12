package br.com.aws.dynamodb.mapper;

import br.com.aws.dynamodb.domain.Customer;
import br.com.aws.dynamodb.entinty.CustomerEntity;
import br.com.aws.dynamodb.response.CustomerResponse;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.stream.Collectors;


@Mapper(componentModel = "spring")
public interface FilmeAtorMapper {

    public static List<Customer> mapToDomain(List<CustomerEntity> customerEntity){
        return customerEntity.stream().map(FilmeAtorMapper::mapToDomain).collect(Collectors.toList());
    }


    public static Customer mapToDomain(CustomerEntity customerEntity){
       return Customer.builder().customer_id(customerEntity.getCustomerId())
               .active(customerEntity.getActive()).activebool(customerEntity.getActivebool())
               .address_id(customerEntity.getAddressId()).email(customerEntity.getEmail())
               .create_date(customerEntity.getCreateDate()).first_name(customerEntity.getFirstName())
               .last_name(customerEntity.getLastName()).store_id(customerEntity.getStoreId()).build();
    }



    public static List<CustomerResponse> mapToResponse(List<Customer>country) {
        return country.stream().map(FilmeAtorMapper::mapToResponse).collect(Collectors.toList());
    }

    public static CustomerResponse mapToResponse(Customer customer) {
        return CustomerResponse.builder().customerId(customer.getCustomer_id()).active(customer.getActive())
                .activebool(customer.getActivebool()).email(customer.getEmail()).firstName(customer.getFirst_name())
                .createDate(customer.getCreate_date()).storeId(customer.getStore_id()).build();
    }


}
