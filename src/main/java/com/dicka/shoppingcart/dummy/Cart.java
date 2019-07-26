package com.dicka.shoppingcart.dummy;

import java.util.Date;
import java.util.List;

public class Cart {

    private int id;
    private Date currDate;
    private Account account;
    private double totalPrice;
    private List<CartItem> cartItems;

    public Cart(){}

    public Cart(int id, Date currDate, Account account, double totalPrice, List<CartItem> cartItems){
        this.id = id;
        this.currDate = currDate;
        this.account = account;
        this.totalPrice = totalPrice;
        this.cartItems = cartItems;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCurrDate() {
        return currDate;
    }

    public void setCurrDate(Date currDate) {
        this.currDate = currDate;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public List<CartItem> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<CartItem> cartItems) {
        this.cartItems = cartItems;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", currDate=" + currDate +
                ", account=" + account +
                ", totalPrice=" + totalPrice +
                ", cartItems=" + cartItems +
                '}';
    }
}
