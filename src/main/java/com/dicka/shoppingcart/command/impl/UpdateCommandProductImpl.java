package com.dicka.shoppingcart.command.impl;

import com.dicka.shoppingcart.command.UpdateCommandProduct;
import com.dicka.shoppingcart.entity.Product;
import com.dicka.shoppingcart.model.RequestProduct;
import com.dicka.shoppingcart.model.RequestUpdateProduct;
import com.dicka.shoppingcart.repository.ProductRepository;
import com.dicka.shoppingcart.util.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdateCommandProductImpl extends AbstractCommand<Product, RequestUpdateProduct>
    implements UpdateCommandProduct{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product doExecute(RequestUpdateProduct request) {
        return update(request.getProductId(), request);
    }

    private Product update(Long productId, RequestUpdateProduct request){
        return productRepository.findById(productId)
                .map(product -> {
                    product.setName(request.getName());
                    product.setStock(request.getStock());
                    product.setPrice(request.getPrice());
                    product.setDiscount(request.isDiscount());
                    product.setStatus(request.isStatus());
                    return productRepository.save(product);
                }).orElseThrow(() -> new RuntimeException());
    }
}
