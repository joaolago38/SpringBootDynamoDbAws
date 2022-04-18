package br.com.aws.dynamodb.operations;

import br.com.aws.dynamodb.domain.FilmeCategoria;
import br.com.aws.dynamodb.domain.Inventario;
import br.com.aws.dynamodb.mapper.FilmeCategoriaMapper;
import br.com.aws.dynamodb.mapper.InventarioMapper;
import br.com.aws.dynamodb.port.BuscaDadosFilmeCategoriaPort;
import br.com.aws.dynamodb.port.BuscaDadosInventarioPort;
import br.com.aws.dynamodb.repository.FilmeCategoryRespository;
import br.com.aws.dynamodb.repository.InventarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class BuscaInventarioOperation implements BuscaDadosInventarioPort {

    private final InventarioRepository inventarioRepository;


    @Override
    public List<Inventario> buscarInventarioId(Integer inventory_id) {
        return InventarioMapper.mapToDomain(inventarioRepository.buscarInventoryPorCodigoId(inventory_id));
    }

    @Override
    public List<Inventario> buscarInventarioPorCodigoAll() {
        return InventarioMapper.mapToDomain(inventarioRepository.findAll());
    }
}
