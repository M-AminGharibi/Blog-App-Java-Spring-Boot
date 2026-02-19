package com.amingharibi.blog.mappers;

import com.amingharibi.blog.domain.CreatePostRequest;
import com.amingharibi.blog.domain.UpdatePostRequest;
import com.amingharibi.blog.domain.dtos.CreatePostRequestDto;
import com.amingharibi.blog.domain.dtos.PostDto;
import com.amingharibi.blog.domain.dtos.UpdatePostRequestDto;
import com.amingharibi.blog.domain.entities.Post;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PostMapper {

    @Mapping(target = "author", source = "author")
    @Mapping(target = "category", source = "category")
    @Mapping(target = "tags", source = "tags")
    @Mapping(target = "status", source = "status")
    PostDto toDto(Post post);

    CreatePostRequest toCreatePostRequest(CreatePostRequestDto dto);

    UpdatePostRequest toUpdatePostRequest(UpdatePostRequestDto dto);

}
