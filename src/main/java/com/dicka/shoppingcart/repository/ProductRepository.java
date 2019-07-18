package com.dicka.shoppingcart.repository;

import com.dicka.shoppingcart.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("SELECT p FROM Product p WHERE p.status = true")
    List<Product> listProductStatusTrue();

    @Query("SELECT p FROM Product p WHERE p.status = false")
    List<Product> listProductStatusFalse();

    @Query("SELECT p FROM Product p WHERE p.id = :id")
    Product findProductById(@Param("id") Long id);
}
