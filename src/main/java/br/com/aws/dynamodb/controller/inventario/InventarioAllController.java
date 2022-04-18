package br.com.aws.dynamodb.controller.inventario;

import br.com.aws.dynamodb.mapper.FilmeMapper;
import br.com.aws.dynamodb.mapper.InventarioMapper;
import br.com.aws.dynamodb.response.FilmeResponse;
import br.com.aws.dynamodb.response.InventarioResponse;
import br.com.aws.dynamodb.usecase.FilmeUseCase;
import br.com.aws.dynamodb.usecase.InventarioUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/buscarAllInventario")
public class InventarioAllController {


    private final InventarioUseCase inventarioUseCase;

    @GetMapping()
    public ResponseEntity<List<InventarioResponse>> consultarInventarioPorAll( ) {

        List<InventarioResponse>  response = InventarioMapper.mapToResponse(inventarioUseCase.buscaInvetarioAll());
        return ResponseEntity.ok(response);


    }
}
