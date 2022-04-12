package br.com.aws.dynamodb.port;



import br.com.aws.dynamodb.domain.Customer;

import java.util.List;

public interface BuscaDadosCustomerPort {

   List<Customer> buscarCustomerPorCodigoId(Integer category_id);


   List<Customer> buscarCustomerPorCodigoAll();
}
