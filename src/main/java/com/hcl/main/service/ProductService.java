package com.hcl.main.service;

import com.hcl.main.model.Product;
import org.springframework.stereotype.Service;

@Service
public interface ProductService{
    public Product saveProduct(Product product);
}
