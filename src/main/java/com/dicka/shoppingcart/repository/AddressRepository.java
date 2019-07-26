package com.dicka.shoppingcart.repository;

import com.dicka.shoppingcart.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {
}
