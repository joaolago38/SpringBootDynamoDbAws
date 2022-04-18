package br.com.aws.dynamodb.mapper;

import br.com.aws.dynamodb.domain.Inventario;
import br.com.aws.dynamodb.entinty.InventarioEntity;
import br.com.aws.dynamodb.response.InventarioResponse;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.stream.Collectors;


@Mapper(componentModel = "spring")
public interface InventarioMapper {

    public static List<Inventario> mapToDomain(List<InventarioEntity> inventarioEntity){
        return inventarioEntity.stream().map(InventarioMapper::mapToDomain).collect(Collectors.toList());
    }


    public static Inventario mapToDomain(InventarioEntity inventarioEntity){
       return Inventario.builder().inventory_id(inventarioEntity.getInventoryId()).film_id(inventarioEntity.getFilmId()).last_update(inventarioEntity.getLastUpdate()).store_id(inventarioEntity.getStoreId()).build();
    }



    public static List<InventarioResponse> mapToResponse(List<Inventario> inventario) {
        return inventario.stream().map(InventarioMapper::mapToResponse).collect(Collectors.toList());
    }

    public static InventarioResponse mapToResponse(Inventario inventario) {
        return InventarioResponse.builder().inventoryId(inventario.getInventory_id()).filmId(inventario.getFilm_id()).storeId(inventario.getStore_id()).build();
    }


}