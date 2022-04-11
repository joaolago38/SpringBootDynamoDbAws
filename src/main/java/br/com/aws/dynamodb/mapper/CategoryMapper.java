package br.com.aws.dynamodb.mapper;

import br.com.aws.dynamodb.domain.Category;
import br.com.aws.dynamodb.entinty.CategoryEntity;
import br.com.aws.dynamodb.response.CategoryResponse;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.stream.Collectors;


@Mapper(componentModel = "spring")
public interface CategoryMapper {

    Category toModel(CategoryEntity model);

    public static Category mapToDomain(CategoryEntity categoryEntity){
       return Category.builder().category_id(categoryEntity.getCategoryId()).last_update(categoryEntity.getLastUpdate()).build();
    }

    public static List<Category> mapToDomain(List<CategoryEntity> categoryEntity){
        return categoryEntity.stream().map(CategoryMapper::mapToDomain).collect(Collectors.toList());
    }


    public static List<CategoryResponse> mapToResponse(List<Category>category) {
        return category.stream().map(CategoryMapper::mapToResponse).collect(Collectors.toList());
    }

    public static CategoryResponse mapToResponse(Category category) {
        return CategoryResponse.builder().categoryId(category.getCategory_id()).categoryId(category.getCategory_id()).build();
    }


}
