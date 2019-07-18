package com.dicka.shoppingcart.command.impl;

import com.dicka.shoppingcart.command.FindByIdCommandProduct;
import com.dicka.shoppingcart.entity.Product;
import com.dicka.shoppingcart.model.RequestUpdateProduct;
import com.dicka.shoppingcart.repository.ProductRepository;
import com.dicka.shoppingcart.util.AbstractCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class FindByIdCommandProductImpl extends AbstractCommand<Product, RequestUpdateProduct>
    implements FindByIdCommandProduct {

    private static final Logger log = LoggerFactory.getLogger(FindByIdCommandProductImpl.class);

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product doExecute(RequestUpdateProduct request) {
        return findId(request);
    }

    private Product findId(RequestUpdateProduct req){
        return productRepository.findProductById(req.getProductId());
    }
}
