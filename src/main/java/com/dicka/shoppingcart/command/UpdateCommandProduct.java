package com.dicka.shoppingcart.command;

import com.dicka.shoppingcart.entity.Product;
import com.dicka.shoppingcart.model.RequestProduct;
import com.dicka.shoppingcart.model.RequestUpdateProduct;
import com.dicka.shoppingcart.util.Command;

public interface UpdateCommandProduct extends Command<Product, RequestUpdateProduct> {
}
