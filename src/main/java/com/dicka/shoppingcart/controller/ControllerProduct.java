package com.dicka.shoppingcart.controller;

import com.dicka.shoppingcart.command.FindByIdCommandProduct;
import com.dicka.shoppingcart.command.InsertCommandProduct;
import com.dicka.shoppingcart.command.UpdateCommandProduct;
import com.dicka.shoppingcart.entity.Product;
import com.dicka.shoppingcart.model.RequestProduct;
import com.dicka.shoppingcart.model.RequestUpdateProduct;
import com.dicka.shoppingcart.repository.ProductRepository;
import com.dicka.shoppingcart.util.ServiceExecutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping(value = "/api/product")
public class ControllerProduct {

    @Autowired
    private ServiceExecutor executor;
    private HashMap<String, String> hashMapValidation = null;

    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public ResponseEntity<List<Product>> listProduct(){
        List<Product> productList = productRepository.findAll();
        if (productList.isEmpty() || productList == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(productList, HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<Object> createProduct(@RequestBody @Valid RequestProduct req,
                                                        BindingResult bindingResult){

        if (bindingResult.hasErrors()){
            hashMapValidation = new HashMap<>();
            for (FieldError fieldError : bindingResult.getFieldErrors()){
                hashMapValidation.put(fieldError.getField(), fieldError.getDefaultMessage());
            }
            return new ResponseEntity<>(hashMapValidation, HttpStatus.NOT_ACCEPTABLE);
        }

        Product product = new Product();
        product.setName(req.getName());
        product.setPrice(req.getPrice());
        product.setDiscount(req.isDiscount());
        product.setStock(req.getStock());
        product.setStatus(req.isStatus());


        executor.execute(InsertCommandProduct.class, req);
        return new ResponseEntity<>(product, HttpStatus.CREATED);
    }

    @GetMapping(value = "/by/{productId}")
    public ResponseEntity<Object> findId(@PathVariable("productId") Long productId){

        Product product = productRepository.findProductById(productId);

        if (product == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else{

            RequestUpdateProduct byIdproduct = new RequestUpdateProduct();
            byIdproduct.setProductId(product.getId());
            byIdproduct.setName(product.getName());
            byIdproduct.setDiscount(product.isDiscount());
            byIdproduct.setPrice(product.getPrice());
            byIdproduct.setStock(product.getStock());
            byIdproduct.setStatus(product.isStatus());
            executor.execute(FindByIdCommandProduct.class, byIdproduct);
            return new ResponseEntity<>(byIdproduct, HttpStatus.OK);
        }
    }

    @PutMapping(value = "/{productId}")
    public ResponseEntity<Object> updateProduct(@PathVariable("productId") Long productId,
                                                @RequestBody @Valid RequestUpdateProduct req,
                                                BindingResult bindingResult) {

        if (bindingResult.hasErrors()){
            hashMapValidation = new HashMap<>();
            for (FieldError fieldError : bindingResult.getFieldErrors()) {
                hashMapValidation.put(fieldError.getField(), fieldError.getDefaultMessage());
            }
            return new ResponseEntity<>(hashMapValidation, HttpStatus.NOT_ACCEPTABLE);
        }


        RequestUpdateProduct update = new RequestUpdateProduct();
        update.setProductId(productId);
        update.setName(req.getName());
        update.setStock(req.getStock());
        update.setPrice(req.getPrice());
        update.setStatus(req.isStatus());
        update.setDiscount(req.isDiscount());

        executor.execute(UpdateCommandProduct.class, update);
        return new ResponseEntity<>(update, HttpStatus.OK);
    }
}
