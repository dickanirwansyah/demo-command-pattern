package com.dicka.shoppingcart;

import com.dicka.shoppingcart.command.AccountCommandInsert;
import com.dicka.shoppingcart.command.InsertCommandProduct;
import com.dicka.shoppingcart.model.AccountRequestInsert;
import com.dicka.shoppingcart.model.RequestProduct;
import com.dicka.shoppingcart.util.ServiceExecutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.util.Date;

@SpringBootApplication
public class ShoppingCartApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingCartApplication.class, args);
	}

}

//@Component
//class CommandLineAccountData implements CommandLineRunner {
//
//	private static final Logger log = LoggerFactory.getLogger(CommandLineAccountData.class);
//
//	@Autowired
//	private ServiceExecutor serviceExecutor;
//
//	@Override
//	public void run(String... args) throws Exception {
//		AccountRequestInsert req = new AccountRequestInsert();
//
//		req.setFirstname("Muhammad");
//		req.setLastname("Dicka Nirwansyah");
//		req.setEmail("dickanirwansyah@gmail.com");
//		req.setDob(new Date());
//		req.setAge(23);
//		req.setGender("Laki-Laki");
//		req.setCity("Jakarta");
//		req.setStreet("Jl.h.mandor");
//		req.setNumber("NO.36");
//		req.setProvince("DKI Jakarta");
//		req.setVillage("Cilandak");
//		req.setZipCode("12430");
//
//		serviceExecutor.execute(AccountCommandInsert.class, req);
//
//	}
//}

//@Component
//class CommandLineRunnerTestData implements CommandLineRunner {
//
//	private static final Logger TAG = LoggerFactory.getLogger(CommandLineRunnerTestData.class);
//
//	@Autowired
//	private ServiceExecutor serviceExecutor;
//
//	@Override
//	public void run(String... args) throws Exception {
//
//		RequestProduct reqProd = new RequestProduct();
//		reqProd.setName("");
//		reqProd.setDiscount(true);
//		reqProd.setStock(0);
//		reqProd.setPrice(8000000);
//		reqProd.setStatus(true);
//		serviceExecutor.execute(InsertCommandProduct.class, reqProd);
//
//		TAG.info("reqProduct : "+reqProd.toString());
//	}
