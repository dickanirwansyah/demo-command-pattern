package com.dicka.shoppingcart.dummy.service;

import com.dicka.shoppingcart.dummy.Account;
import com.dicka.shoppingcart.dummy.Cart;
import com.dicka.shoppingcart.dummy.CartItem;
import com.dicka.shoppingcart.dummy.constant.ConstantVariable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CartService {

    private static final Logger log = LoggerFactory.getLogger(CartService.class);

    public CartService(){}

    public Cart removeItemFromCart(Account account, List<CartItem> cartItems){
        Cart cart = new Cart();
        cart.setAccount(account);
        cart.setCurrDate(new Date());

        return null;
    }

    public Cart addToCartItem(Account account, List<CartItem> cartItems){
        Cart cart = new Cart();
        cart.setAccount(account);
        cart.setCurrDate(new Date());
        boolean discount = ConstantVariable.DISCOUNT_FALSE;
        int potonganHarga = 10;

        double totalPrice = 0;
        double totalFinalPrice = 0;

        for (CartItem cartItem : cartItems){

            CartItem itemCart = new CartItem();
            cartItems = new ArrayList<>();

            itemCart.setProducts(cartItem.getProducts());
            itemCart.setQty(cartItem.getQty());
            itemCart.setPrice(cartItem.getProducts().getPrice());
            cartItems.add(itemCart);

            //calculate price
            totalPrice += itemCart.getQty() * itemCart.getProducts().getPrice();

            String resultCartItem = String.format("| %s | %s | %s |",
                    itemCart.getProducts().getName(),
                    itemCart.getPrice(),
                    itemCart.getQty());
            totalFinalPrice = totalPrice;
            log.info("addToCartItem : "+resultCartItem);
        }

        if (totalPrice > 15){
            discount = ConstantVariable.DISCOUNT_TRUE;
            log.info("discount : "+discount);
            totalFinalPrice = totalPrice - potonganHarga;
            cart.setTotalPrice(totalFinalPrice);
        }else{
            log.info("discount : "+discount);
            cart.setTotalPrice(totalFinalPrice);
            cart.setCartItems(cartItems);
        }

        String resultCart = String.format("| %s | %s | %s | ", cart.getAccount(),
                cart.getCurrDate(), cart.getTotalPrice());
        log.info("cartInformation : "+resultCart);

        return cart;
    }
}
