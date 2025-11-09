package com.localeventmanagementsysytem.localeventmanagementsystem.controller;

import com.localeventmanagementsysytem.localeventmanagementsystem.dto.CategoryDto;
import com.localeventmanagementsysytem.localeventmanagementsystem.service.serviceinterface.CategoryServiceInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryServiceInterface categorySevice;

    @PostMapping
    public ResponseEntity<CategoryDto> createCategory(@RequestBody CategoryDto categoryDto) {
        return new ResponseEntity<>(categorySevice.createCategory(categoryDto), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategoryDto> getCategoryById(@PathVariable Long id) {
        return ResponseEntity.ok(categorySevice.getCategoryById(id));
    }

    @GetMapping
    public ResponseEntity<List<CategoryDto>> getAllCategories() {
        return ResponseEntity.ok(categorySevice.getAllCategories());
    }

    @PutMapping("/{id}")
    public ResponseEntity<CategoryDto> updateCategory(@PathVariable Long id, @RequestBody CategoryDto categoryDto) {
        return ResponseEntity.ok(categorySevice.updateCategory(categoryDto, id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCategory(@PathVariable Long id) {
        categorySevice.deleteCategory(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<CategoryDto> getCategoryByName(@PathVariable String name) {
        return ResponseEntity.ok(categorySevice.getCategoryByName(name));
    }

    @GetMapping("/description/{description}")
    public ResponseEntity<List<CategoryDto>> getCategoryByDescription(@PathVariable String description) {
        return ResponseEntity.ok(categorySevice.getCategoryByDescription(description));
    }
}
