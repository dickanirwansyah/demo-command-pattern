package com.dicka.shoppingcart.dummy;

public class CartItem {

    private Products products;
    private int qty;
    private double price;

    public CartItem(){}

    public CartItem(Products products, int qty, double price) {
        this.products = products;
        this.qty = qty;
        this.price = price;
    }

    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "CartItem{" +
                "products=" + products +
                ", qty=" + qty +
                ", price=" + price +
                '}';
    }
}
