package com.Practice.Web.controller;

import com.Practice.Web.model.Product;
import com.Practice.Web.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/get")
    public List<Product> getProducts(){
        return productService.getProducts();
    }

    @PostMapping("/add")
    public void addProduct(@RequestBody Product product){
        productService.addProduct(product);
    }


    @PutMapping("/{id}")
    public ResponseEntity<?> upadateProduct(@PathVariable int id,@RequestBody Product product){
        try {
            Product product1 = productService.updateProduct(id, product);
            if (product1 != null)
                return new ResponseEntity<>(product1, HttpStatus.OK);
            else
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }catch (Exception ex){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @GetMapping("/get/{id}")
    public Product getProductById(@PathVariable int id){
        return productService.getProductById(id);
    }







}
