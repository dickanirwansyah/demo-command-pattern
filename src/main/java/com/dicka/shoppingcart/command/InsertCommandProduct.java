package com.dicka.shoppingcart.command;

import com.dicka.shoppingcart.entity.Product;
import com.dicka.shoppingcart.model.RequestProduct;
import com.dicka.shoppingcart.util.Command;

public interface InsertCommandProduct extends Command<Product, RequestProduct> {
}
