package com.example.springbootmongodbtutorial;

import com.example.springbootmongodbtutorial.model.Product;
import com.example.springbootmongodbtutorial.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringBootMongodbTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMongodbTutorialApplication.class, args);
	}

//	@Autowired
//	ProductRepository productRepository;
//
//	@PostConstruct
//	public void populateData() {
//		Product product1 = new Product();
//		product1.setProductName("iPhone 12");
//		product1.setProductPrice(549.99);
//		product1.setProductDescription("Very nice iPhone!");
//
//		Product product2 = new Product();
//		product2.setProductName("MacBook pro 2023");
//		product2.setProductPrice(2149.99);
//		product2.setProductDescription("Very nice MacBook Pro!");
//
//		productRepository.save(product1);
//		productRepository.save(product2);
//	}

}
