package com.example.apicrud.controller;

import com.example.apicrud.model.Product;
import com.example.apicrud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("products")
public class ProductController {
    @Autowired
    ProductService productService;
    @PostMapping("/save")
    public ResponseEntity<Product> save(@RequestBody Product product){
        return new ResponseEntity<Product>(productService.save(product), HttpStatus.OK);
    }
    @GetMapping("/findAll")
    public ResponseEntity<ArrayList<Product>> findAll(){
        return new ResponseEntity<>(productService.findAll(),HttpStatus.OK);
    }
    @GetMapping("/findById{id}")
    public ResponseEntity<Product> findById(@PathVariable long id){
        return new ResponseEntity<>(productService.findById(id),HttpStatus.OK);
    }
    @DeleteMapping("/delete{id}")
    public ResponseEntity delete(@PathVariable long id){
        productService.delete(id);
        return new ResponseEntity(HttpStatus.OK);
    }
}
