package com.ttrc.accounts.mapper;


import com.ttrc.accounts.dto.AccountDto;
import com.ttrc.accounts.entity.Account;

public class AccountMapper {

    // Convert AccountDto JPA Entity into Account
    public static AccountDto mapToAccountDto(Account account) {

    AccountDto accountDto = AccountDto.builder()
            .accountbalance(account.getAccountbalance())
            .accountname(account.getAccountname())
            .accounttype(account.getAccounttype())
            .brokername(account.getBrokername())
            .description(account.getDescription())
            .isactive(account.getIsactive())
            .build();
        return accountDto;
    }

    // Convert Account JPA Entity into AccountDto
    public static Account mapToAccountDto(AccountDto accountDto) {

        Account account = Account.builder()
                .accountbalance(accountDto.getAccountbalance())
                .accountname(accountDto.getAccountname())
                .accounttype(accountDto.getAccounttype())
                .brokername(accountDto.getBrokername())
                .description(accountDto.getDescription())
                .isactive(accountDto.getIsactive())
                .build();
        return account;
    }

}

