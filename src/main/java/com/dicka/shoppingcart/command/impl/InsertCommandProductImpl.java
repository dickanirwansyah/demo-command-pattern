package com.dicka.shoppingcart.command.impl;

import com.dicka.shoppingcart.command.InsertCommandProduct;
import com.dicka.shoppingcart.entity.Product;
import com.dicka.shoppingcart.model.RequestProduct;
import com.dicka.shoppingcart.repository.ProductRepository;
import com.dicka.shoppingcart.util.AbstractCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class InsertCommandProductImpl extends AbstractCommand<Product, RequestProduct>
    implements InsertCommandProduct {

    private static final Logger log = LoggerFactory.getLogger(InsertCommandProductImpl.class);

    private final ProductRepository productRepository;

    @Autowired
    public InsertCommandProductImpl(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @Override
    public Product doExecute(RequestProduct request) {
        return insert(request);
    }

    private Product insert(RequestProduct requestProduct){
        return productRepository
                .save(new Product(requestProduct.getName(),
                        requestProduct.getPrice(),
                        requestProduct.getStock(),
                        requestProduct.isStatus(),
                        requestProduct.isDiscount()));
    }
}
