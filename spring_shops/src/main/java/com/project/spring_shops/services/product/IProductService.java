package com.project.spring_shops.services.product;

import java.util.List;

import com.project.spring_shops.model.Product;
import com.project.spring_shops.requests.AddProductRequest;
import com.project.spring_shops.requests.UpdateProductRequest;

public interface IProductService {
    Product addProduct(AddProductRequest request);
    Product getProductById(Long id);
    void deleteProductById(Long id);
    Product updateProduct(UpdateProductRequest request, Long productId);
    
    List<Product> getAllProducts();

    List<Product> getProductsByCategory(String category);

    List<Product> getProductsByBrand(String brand);

    List<Product> getProductsByCategoryAndBrand(String category, String brand);

    List<Product> getProductsByName(String name);

    List<Product> getProductByBrandAndName(String brand, String name);

    Long countProductsByBrandAndName(String brand, String name);
}
