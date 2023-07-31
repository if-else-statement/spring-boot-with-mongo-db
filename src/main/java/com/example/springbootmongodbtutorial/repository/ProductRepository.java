package com.example.springbootmongodbtutorial.repository;

import com.example.springbootmongodbtutorial.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
