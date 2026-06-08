package com.example.Demo;

import com.example.Demo.Entities.Product;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class ProductService {
    private HashMap<Integer, Product> productMap = new HashMap<>();

    @PostConstruct
    public void loadSampleProducts() {

        productMap.put(1, new Product(1, "Laptop", 500));
        productMap.put(2, new Product(2, "Phone", 300));
        productMap.put(3, new Product(3, "Tablet", 200));
    }

    public String deleteProductById(int productId) {

        if (productMap.containsKey(productId)) {

            Product deletedProduct = productMap.remove(productId);

            return "Product Deleted Successfully\n"
                    + "Product ID: " + deletedProduct.getProductId() + "\n"
                    + "Product Name: " + deletedProduct.getProductName() + "\n"
                    + "Status: Removed from inventory";
        }

        return "Product not found\nNo deletion performed";
    }

    public HashMap<Integer, Product> getAllProducts() {
        return productMap;
    }
}

