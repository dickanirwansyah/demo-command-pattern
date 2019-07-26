package com.dicka.shoppingcart.dummy;

import com.dicka.shoppingcart.dummy.service.CartService;
import com.dicka.shoppingcart.entity.Product;

import java.util.ArrayList;
import java.util.List;

public class MainService {

    public static void main(String[] args){
        CartService cartService = new CartService();
        Account account = new Account();
        account.setId(1);
        account.setUsername("DickaNirwansyah");
        account.setEmail("dicka@gmail.com");

        Products p1 = new Products();
        p1.setId(1);
        p1.setName("example 1");
        p1.setPrice(2);
        p1.setStock(20);

        Products p2 = new Products();
        p2.setId(2);
        p2.setStock(20);
        p2.setPrice(3);
        p2.setName("example 2");

        Products p3 = new Products();
        p3.setId(3);
        p3.setStock(20);
        p3.setPrice(3);
        p3.setName("example 3");

        Products p4 = new Products();
        p4.setId(4);
        p4.setStock(20);
        p4.setPrice(4);
        p4.setName("example 4");

        Products p5 = new Products();
        p5.setId(5);
        p5.setStock(20);
        p5.setPrice(8);
        p5.setName("example 5");

        //form cartItem
        List<CartItem> cartItems = new ArrayList<>();
        cartItems.add(new CartItem(p1, 1, p1.getPrice()));
        cartItems.add(new CartItem(p2, 1, p2.getPrice()));
        cartItems.add(new CartItem(p3, 1, p3.getPrice()));
        cartItems.add(new CartItem(p4, 1, p4.getPrice()));
        cartItems.add(new CartItem(p5, 1, p5.getPrice()));

        //save cartItem
        cartService.addToCartItem(account, cartItems);
    }
}
