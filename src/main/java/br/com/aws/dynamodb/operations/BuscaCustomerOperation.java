package br.com.aws.dynamodb.operations;

import br.com.aws.dynamodb.domain.Customer;

import br.com.aws.dynamodb.mapper.CustomerMapper;
import br.com.aws.dynamodb.port.BuscaDadosCustomerPort;
import br.com.aws.dynamodb.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class BuscaCustomerOperation implements BuscaDadosCustomerPort {

    private final CustomerRepository customerRepository;


    @Override
    public List<Customer> buscarCustomerPorCodigoId(Integer customer_id) {
        return CustomerMapper.mapToDomain(customerRepository.buscarCustumerPorCodigoId(customer_id));
    }

    @Override
    public List<Customer> buscarCustomerPorCodigoAll() {
        return CustomerMapper.mapToDomain(customerRepository.findAll());
    }
}
