package br.com.aws.dynamodb.controller.customer;

import br.com.aws.dynamodb.mapper.CityMapper;
import br.com.aws.dynamodb.mapper.CustomerMapper;
import br.com.aws.dynamodb.response.CityResponse;
import br.com.aws.dynamodb.response.CustomerResponse;
import br.com.aws.dynamodb.usecase.CityUseCase;
import br.com.aws.dynamodb.usecase.CustomerUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/buscarAllCustomer")
public class CustomerAllController {


    private final CustomerUseCase customerUseCase;

    @GetMapping()
    public ResponseEntity<List<CustomerResponse>> consultarCustomerPorAll( ) {

        List<CustomerResponse>  response = CustomerMapper.mapToResponse(customerUseCase.buscaCustomerAll());
        return ResponseEntity.ok(response);


    }
}
