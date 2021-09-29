package com.example.apicrud.repository;

import com.example.apicrud.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface IProductRepo extends CrudRepository<Product,Long> {
}
