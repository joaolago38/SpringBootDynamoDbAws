package br.com.aws.dynamodb.operations;

import br.com.aws.dynamodb.domain.Category;
import br.com.aws.dynamodb.mapper.AdressMapper;
import br.com.aws.dynamodb.mapper.CategoryMapper;
import br.com.aws.dynamodb.port.BuscaDadosCategoryPort;
import br.com.aws.dynamodb.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class BuscaCategoryOperation implements BuscaDadosCategoryPort {

    private final CategoryRepository categoryRepository;


    @Override
    public List<Category> buscarCategoryPorCodigoId(Integer category_id) {
        return CategoryMapper.mapToDomain(categoryRepository.buscarCategoryPorCodigoId(category_id));
    }

    @Override
    public List<Category> buscarCategoryPorCodigoAll() {
        return CategoryMapper.mapToDomain(categoryRepository.findAll());
    }

}
