package com.dicka.shoppingcart.repository;

import com.dicka.shoppingcart.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
