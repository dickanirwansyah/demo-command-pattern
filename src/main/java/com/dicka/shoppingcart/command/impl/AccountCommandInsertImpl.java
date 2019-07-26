package com.dicka.shoppingcart.command.impl;

import com.dicka.shoppingcart.command.AccountCommandInsert;
import com.dicka.shoppingcart.entity.Account;
import com.dicka.shoppingcart.entity.Address;
import com.dicka.shoppingcart.model.AccountRequestInsert;
import com.dicka.shoppingcart.repository.AccountRepository;
import com.dicka.shoppingcart.repository.AddressRepository;
import com.dicka.shoppingcart.util.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountCommandInsertImpl extends AbstractCommand<Account, AccountRequestInsert>
implements AccountCommandInsert {


    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public Account doExecute(AccountRequestInsert request) {
        return saveAccount(request);
    }

    private Account saveAccount(AccountRequestInsert insert){
        Account account = new Account();
        account.setFirstname(insert.getFirstname());
        account.setLastname(insert.getLastname());
        account.setEmail(insert.getEmail());
        account.setDob(insert.getDob());
        account.setGender(insert.getGender());
        account.setAge(insert.getAge());

        Address address = new Address();
        address.setCity(insert.getCity());
        address.setNumber(insert.getNumber());
        address.setStreet(insert.getStreet());
        address.setVillage(insert.getVillage());
        address.setZipCode(insert.getZipCode());
        address.setProvince(insert.getProvince());
        account.setAddress(address);

        addressRepository.save(address);
        accountRepository.save(account);
        return account;
    }

}
