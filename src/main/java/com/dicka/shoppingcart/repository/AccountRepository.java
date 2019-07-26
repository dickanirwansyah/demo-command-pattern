package com.dicka.shoppingcart.repository;

import com.dicka.shoppingcart.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Integer> {

}
