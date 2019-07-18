package com.dicka.shoppingcart.controller.page;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerIndex {

    private static final Logger log = LoggerFactory.getLogger(ControllerIndex.class);

    @GetMapping(value = {"/", "/index", "/home"})
    public String getIndex(Model model){
        model.addAttribute("title", "Home");
        model.addAttribute("activeClass", "active");
        log.info("getIndex()");
        return "index";
    }

    @GetMapping(value = "/product")
    public String getProduct(Model model){
        model.addAttribute("title", "Data Product");
        model.addAttribute("activeClass", "active");
        log.info("getProduct()");
        return "kontent/product";
    }

    @GetMapping(value = "/transaction")
    public String getTransaction(Model model){
        model.addAttribute("title", "Data Transaction");
        model.addAttribute("activeClass", "active");
        log.info("getTransaction()");
        return "kontent/transaction";
    }
}
