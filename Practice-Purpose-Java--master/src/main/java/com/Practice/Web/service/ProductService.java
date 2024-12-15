package com.Practice.Web.service;

import com.Practice.Web.model.Product;
import com.Practice.Web.repositary.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepo productRepo;


    public List<Product> getProducts() {
        return productRepo.findAll();
    }

    public void addProduct(Product product) {
        productRepo.save(product);
    }


    public Product getProductById(int id) {
        return productRepo.findById(id).orElse(new Product());
    }

    public Product updateProduct(int id, Product product) {
        Product product1 = productRepo.findById(id).orElse(null);
        if (product1 != null){
            product1.setName(product.getName());
            return productRepo.save(product1);
        }else {
            return null;
        }

    }
}
