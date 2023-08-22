package com.ttrc.accounts.serviceImpl;

import java.util.List;
import com.ttrc.accounts.dto.AccountDto;
import com.ttrc.accounts.entity.Account;
import com.ttrc.accounts.mapper.AccountAutoMapper;
import com.ttrc.accounts.repository.AccountRepository;
import com.ttrc.accounts.service.AccountService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
//@NoArgsConstructor
@Slf4j

public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountRepository accountRepository;

    @Override
    public List<Account> getAllAccounts() {
        List<Account> account = accountRepository.findAll();
        //List<AccountDto> returnAcc = AccountAutoMapper.MAPPER.map(account);
        //List<User> users = userRepository.findAll();
        //List<UserDto> dtos = AutoUserMapper.MAPPER.map(users);

        //    List<UserDto> dtos = CarMapper.INSTANCE.map(cars);
        return account;

    }
}
