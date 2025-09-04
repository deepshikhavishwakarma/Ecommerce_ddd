package com.hcl.main.service.impl;

import com.hcl.main.model.Product;
import com.hcl.main.repository.ProductRepository;
import com.hcl.main.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
   @Autowired
    private ProductRepository productRepository;
    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }
}
