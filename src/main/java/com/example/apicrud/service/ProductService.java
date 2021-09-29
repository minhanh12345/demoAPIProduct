package com.example.apicrud.service;

import com.example.apicrud.model.Product;
import com.example.apicrud.repository.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class ProductService {
    @Autowired
    IProductRepo iProductRepo;
    public ArrayList<Product> findAll(){
        return (ArrayList<Product>) iProductRepo.findAll();
    }
    public Product findById(long id){
        return iProductRepo.findById(id).get();
    }
    public Product save (Product product){
        return iProductRepo.save(product);
    }
    public void delete(long id){
        iProductRepo.delete(iProductRepo.findById(id).get());
    }
}
