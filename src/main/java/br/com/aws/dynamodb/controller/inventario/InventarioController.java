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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/buscarInventario")
public class InventarioController {

    private final InventarioUseCase inventarioUseCase;

    @GetMapping("/{inventoryId}/inventario")
    public ResponseEntity<List<InventarioResponse>> consultarInventarioPorCodicoId(
            @PathVariable(name = "inventoryId")Integer inventoryId) {

        List<InventarioResponse>  response = InventarioMapper.mapToResponse(inventarioUseCase.buscaPorInventoryId(inventoryId));
        return ResponseEntity.ok(response);


    }
}
