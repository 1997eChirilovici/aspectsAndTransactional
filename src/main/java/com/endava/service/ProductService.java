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
    public Long addNewOne(Product product) {
        Product saved = productRepository.save(product);
        return saved.getId();
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void modifyProductById(Long id){
        Product product = productRepository.findById(id).get();
        product.setPrice(100.0);
    }

}
