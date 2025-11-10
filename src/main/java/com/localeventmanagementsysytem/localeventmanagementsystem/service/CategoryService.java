package com.localeventmanagementsysytem.localeventmanagementsystem.service;

import com.localeventmanagementsysytem.localeventmanagementsystem.dto.CategoryDto;
import com.localeventmanagementsysytem.localeventmanagementsystem.entity.Category;
import com.localeventmanagementsysytem.localeventmanagementsystem.exception.CategoryFoundException;
import com.localeventmanagementsysytem.localeventmanagementsystem.exception.CategoryNotFoundException;
import com.localeventmanagementsysytem.localeventmanagementsystem.mapper.CategoryMapper;
import com.localeventmanagementsysytem.localeventmanagementsystem.repository.CategoryRepository;
import com.localeventmanagementsysytem.localeventmanagementsystem.service.serviceinterface.CategoryServiceInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CategoryService implements CategoryServiceInterface {
    private final CategoryRepository categoryRepository;
    private final CategoryMapper categoryMapper;

    @Override
    public CategoryDto createCategory(CategoryDto categoryDto) {
      categoryRepository.findByName(categoryDto.getName()).ifPresent(category -> {
          throw new CategoryFoundException("category already exists with name: " + categoryDto.getName());
      });
        Category creatingCategory =categoryMapper.toCategoryEntity(categoryDto);
        creatingCategory=categoryRepository.save(creatingCategory);
        return  categoryMapper.toCategoryDto(creatingCategory);
    }

    @Override
    public CategoryDto updateCategory(Long id, CategoryDto categoryDto) {
       Category updatingCategory =categoryRepository.findById(id).orElseThrow(()-> new CategoryNotFoundException("category not found with id: "+id));
       updatingCategory.setName(categoryDto.getName());
       updatingCategory.setDescription(categoryDto.getDescription());
       updatingCategory=categoryRepository.save(updatingCategory);
       return categoryMapper.toCategoryDto(updatingCategory);
    }

    @Override
    public void deleteCategory(Long id) {
      categoryRepository.deleteById(id);
    }

    @Override
    public CategoryDto getCategoryById(Long id) {
        return categoryRepository.findById(id).map(categoryMapper::toCategoryDto).orElseThrow(()->new CategoryNotFoundException("category not found with id: "+id));
    }

    @Override
    public List<CategoryDto> getAllCategories() {
        return categoryRepository.findAll().stream().map(categoryMapper::toCategoryDto).collect(Collectors.toList());
    }

    @Override
    public CategoryDto getCategoryByName(String name) {
        return categoryRepository.findByName(name).map(categoryMapper::toCategoryDto).orElseThrow(() -> new CategoryNotFoundException("category not found with name: " + name));
    }

    @Override
    public List<CategoryDto> getCategoryByDescription(String description) {
        return categoryRepository.findByDescriptionContaining(description).stream().map(categoryMapper::toCategoryDto).collect(Collectors.toList());
    }
}
