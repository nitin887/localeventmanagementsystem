package com.localeventmanagementsysytem.localeventmanagementsystem.service.serviceinterface;

import com.localeventmanagementsysytem.localeventmanagementsystem.dto.CategoryDto;

import java.util.List;

public interface CategoryServiceInterface {
    //create category
    CategoryDto createCategory(CategoryDto categoryDto);
    //update category by id
    CategoryDto updateCategory(CategoryDto categoryDto, Long id);
    //delete category by id
    CategoryDto deleteCategory(Long id);
    //get category by id
    List<CategoryDto> getCategoryById(Long id);
    //get all categories
    List<CategoryDto> getAllCategories();
    //get category by name
    List<CategoryDto> getCategoryByName(String name);
    //get category by description
    List<CategoryDto> getCategoryByDescription(String description);

}
