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

//    @Transactional(propagation = Propagation.REQUIRED)
    public void addNewOne(Product product) {
        productRepository.save(product);
        throw new RuntimeException("ups");
    }

}
