package com.example.demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="accounts")
@Data
@NoArgsConstructor
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank(message="Account cannot be null")
    private String AccountName;
    private String BankName;


    public Account(String accountName, String bankName){
        AccountName= accountName;
        BankName = bankName;
    }


    public void createAccounts(Account account) {
    }
}
