package com.project.spring_shops.requests;

import java.math.BigDecimal;

import com.project.spring_shops.model.Category;

import lombok.Data;

@Data   
public class UpdateProductRequest {
    private Long id;
    private String name;
    private String brand;
    private BigDecimal price;
    private int inventory;
    private String description;

    private Category category;
}
