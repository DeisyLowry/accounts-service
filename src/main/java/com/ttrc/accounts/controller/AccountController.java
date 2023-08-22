package com.ttrc.accounts.controller;


import com.ttrc.accounts.dto.AccountDto;
import com.ttrc.accounts.entity.Account;
import com.ttrc.accounts.mapper.AccountAutoMapper;
import com.ttrc.accounts.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/test")
    public String getTest(){
        return "Hello World";
    }

    @GetMapping("/id")
    public Integer getAccountByIdTest(Integer id){
        return id;
        //return "Hello World"                ;
    }

    @GetMapping
    public ResponseEntity<List<Account>> getAllAccounts(){
        List<Account> accountList = accountService.getAllAccounts();
        //List<AccountDto> returnAcc = AccountAutoMapper.MAPPER.map(accountList);
        return new ResponseEntity<>(accountList, HttpStatus.OK);
        //return accountList;
    }
}
