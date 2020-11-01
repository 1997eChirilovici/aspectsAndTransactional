package com.endava.service;

import com.endava.entity.Product;
import com.endava.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    @Transactional(propagation = Propagation.REQUIRED)
    public void addNewOne(Product product) {
        for(int i = 1; i <= 10; i++) {
            product.setPrice(product.getPrice() + i);
            productRepository.addNewProduct(product.getName(), product.getPrice());
            if(i == 5) {
                throw new RuntimeException("ups");
            }
        }
    }

}
