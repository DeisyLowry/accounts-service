package com.ttrc.accounts.service;

import com.ttrc.accounts.dto.AccountDto;
import com.ttrc.accounts.entity.Account;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AccountService {
    List<Account> getAllAccounts();
}
