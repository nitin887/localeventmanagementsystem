package com.localeventmanagementsysytem.localeventmanagementsystem.dto;

import com.fasterxml.jackson.annotation.JsonView;
import com.localeventmanagementsysytem.localeventmanagementsystem.views.Views;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDto {
    @JsonView(Views.Public.class)
    private Long id;

    @JsonView(Views.Public.class)
    @NotBlank(message = "Category name cannot be blank")
    private String name;

    @JsonView(Views.Admin.class)
    private String description;
}
