package com.endava;

import com.endava.entity.Product;
import com.endava.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import javax.annotation.PostConstruct;

@RequiredArgsConstructor
@SpringBootApplication
@EnableAspectJAutoProxy
public class Application {

    private final ProductService productService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @PostConstruct
    void letsGo() {
        Long productId = productService.addNewOne(Product.builder()
                                                         .name("Bear")
                                                         .price(2.1)
                                                         .build());

        productService.modifyProductById(productId);
    }

}
