package br.com.aws.dynamodb.controller.city;

import br.com.aws.dynamodb.mapper.CategoryMapper;
import br.com.aws.dynamodb.response.CategoryResponse;
import br.com.aws.dynamodb.usecase.CategoryUsecase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/buscarCategory")
public class CityController {

    private final CategoryUsecase categoryUsecase;

    @GetMapping("/{categoryId}/category")
    public ResponseEntity<List<CategoryResponse>> consultarCategoryPorCodigId(
            @PathVariable(name = "categoryId")Integer categoryId) {

        List<CategoryResponse>  response = CategoryMapper.mapToResponse(categoryUsecase.buscaPorCateroyId(categoryId));
        return ResponseEntity.ok(response);


    }
}
