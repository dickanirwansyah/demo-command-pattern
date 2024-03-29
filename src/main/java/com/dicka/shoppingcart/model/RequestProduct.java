package com.dicka.shoppingcart.model;

import com.dicka.shoppingcart.dummy.constant.ConstantVariable;
import com.dicka.shoppingcart.util.ServiceRequest;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class RequestProduct implements ServiceRequest{

    @NotBlank(message = ConstantVariable.PRODUCT_NAME_NULL)
    private String name;

    @NotNull(message = ConstantVariable.PRODUCT_PRICE_NULL)
    private double price;

    @Min(value = 5, message = ConstantVariable.PRODUCT_STOCK_MIN)
    @NotNull(message = ConstantVariable.PRODUCT_STOCK_NULL)
    private int stock;

    private boolean status = true;
    private boolean discount = true;

    public RequestProduct() {
    }

    public RequestProduct(String name, double price, int stock, boolean status, boolean discount) {
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.status = status;
        this.discount = discount;
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
