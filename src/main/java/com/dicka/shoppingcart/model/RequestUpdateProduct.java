package com.dicka.shoppingcart.model;

import com.dicka.shoppingcart.util.ServiceRequest;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class RequestUpdateProduct implements ServiceRequest {

    private Long productId;

    @NotBlank(message = "name still null")
    private String name;

    @NotNull(message = "price still null")
    private double price;

    @Min(1)
    @NotNull(message = "stock still null")
    private int stock;

    private boolean status = true;
    private boolean discount = true;


    public RequestUpdateProduct(){}

    public RequestUpdateProduct(Long productId, @NotBlank(message = "name still null") String name, @NotNull(message = "price still null") double price, @Min(1) @NotNull(message = "stock still null") int stock, boolean status, boolean discount) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.status = status;
        this.discount = discount;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isDiscount() {
        return discount;
    }

    public void setDiscount(boolean discount) {
        this.discount = discount;
    }
}
