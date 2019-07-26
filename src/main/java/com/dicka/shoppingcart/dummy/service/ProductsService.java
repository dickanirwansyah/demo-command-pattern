package com.dicka.shoppingcart.dummy.service;

import com.dicka.shoppingcart.dummy.Products;
import com.dicka.shoppingcart.entity.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProductsService {

    public ProductsService(){}


    public List<Products> listDataProducts(){
        List<Products> dataProducts = new ArrayList<>();
        dataProducts.add(new Products(1, "iphone", 12, 8000));
        dataProducts.add(new Products(2, "samsung", 12, 8000));
        dataProducts.add(new Products(3, "chargeran", 12, 8000));
        dataProducts.add(new Products(4, "tv cable", 12, 8000));
        dataProducts.add(new Products(5, "xiaomi", 12, 8000));
        dataProducts.add(new Products(6, "samsung galaxy", 12, 8000));
        dataProducts.add(new Products(7, "vans", 12, 8000));
        dataProducts.add(new Products(8, "docmart", 12, 8000));
        return dataProducts;
    }
}
