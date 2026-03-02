package com.practice2.practice2;

import com.practice2.practice2.service.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Practice2Application implements CommandLineRunner {

    private final ProductService productService;

    public Practice2Application(ProductService productService) {
        this.productService = productService;
    }

    public static void main(String[] args) {
        SpringApplication.run(Practice2Application.class, args);
    }

    @Override
    public void run(String... args) {
        System.out.println(productService.getAllProducts());
    }
}