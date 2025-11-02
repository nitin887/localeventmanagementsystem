package com.localeventmanagementsysytem.localeventmanagementsystem.mapper;

import com.localeventmanagementsysytem.localeventmanagementsystem.dto.CategoryDto;
import com.localeventmanagementsysytem.localeventmanagementsystem.entity.Category;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    Category toCategoryEntity(CategoryDto categoryDto);
    CategoryDto toCategoryDto(Category category);
}
