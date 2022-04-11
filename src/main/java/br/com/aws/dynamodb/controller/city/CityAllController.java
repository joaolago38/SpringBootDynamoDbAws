package br.com.aws.dynamodb.controller.city;

import br.com.aws.dynamodb.mapper.CategoryMapper;
import br.com.aws.dynamodb.response.CategoryResponse;
import br.com.aws.dynamodb.usecase.CategoryUsecase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/buscarCategory")
public class CityAllController {


    private final CategoryUsecase categoryUsecase;

    @GetMapping()
    public ResponseEntity<List<CategoryResponse>> consultarCategoryPorAll( ) {

        List<CategoryResponse>  response = CategoryMapper.mapToResponse(categoryUsecase.buscaPorCategoryAll());
        return ResponseEntity.ok(response);


    }
}
