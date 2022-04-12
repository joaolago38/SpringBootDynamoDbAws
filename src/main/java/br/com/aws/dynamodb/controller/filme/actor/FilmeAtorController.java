package br.com.aws.dynamodb.controller.filme.actor;

import br.com.aws.dynamodb.mapper.CustomerMapper;
import br.com.aws.dynamodb.response.CustomerResponse;
import br.com.aws.dynamodb.usecase.CustomerUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/buscarFilmeAtor")
public class FilmeAtorController {

    private final CustomerUseCase customerUseCase;

    @GetMapping("/{customerId}/customer")
    public ResponseEntity<List<CustomerResponse>> consultarCustomerPorCodigId(
            @PathVariable(name = "customerId")Integer customerId) {

        List<CustomerResponse>  response = CustomerMapper.mapToResponse(customerUseCase.buscaPorCustomerId(customerId));
        return ResponseEntity.ok(response);


    }
}
