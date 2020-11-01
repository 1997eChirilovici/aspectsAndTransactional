package com.endava.repository;

import com.endava.entity.Product;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

    @Modifying
    @Query(value = "insert into product (name, price) VALUES (:name, :price)", nativeQuery = true)
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    void addNewProduct(@Param("name") String name, @Param("price") Double price);
}
