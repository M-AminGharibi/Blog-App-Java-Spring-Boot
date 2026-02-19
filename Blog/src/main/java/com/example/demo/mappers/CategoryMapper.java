package com.example.demo.mappers;


import com.example.demo.domain.dtos.CategoryDto;
import com.example.demo.domain.entities.Category;
import com.example.demo.domain.entities.Post;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CategoryMapper {

    @Mapping(target = "postCount", source = "posts", qualifiedByName = "calculatePostCount")
    CategoryDto toDto(Category category);


//    default long calculatePostCount(List<Post> posts){
//
//
//
//    }

}
