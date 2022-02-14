package com.example.demo.service;

import com.example.demo.model.Account;
import com.example.demo.repo.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    AccountRepo accountrepo;

    public List<Account> getAccounts(){
        return accountrepo.findAll();
    }
    public void createAccounts(Account account){
        accountrepo.save(new Account(account.getAccountName(), account.getBankName()));
    }
}
