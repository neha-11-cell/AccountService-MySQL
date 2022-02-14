package com.example.demo.Controller;


import com.example.demo.model.Account;
import com.example.demo.repo.AccountRepo;
import com.example.demo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountService accountService;

    @GetMapping("/getaccount")
    public List<Account> getAccount(){
        return accountService.getAccounts();
    }

    @PostMapping("/createAccount")
    public void createAccounts(@Valid @RequestBody Account account){
        account.createAccounts(account);
    }
}
