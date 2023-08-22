package com.ttrc.accounts.mapper;

import java.util.List;

import com.ttrc.accounts.dto.AccountDto;
import com.ttrc.accounts.entity.Account;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper
public interface AccountAutoMapper {

    AccountAutoMapper MAPPER = Mappers.getMapper(AccountAutoMapper.class);

    AccountDto mapToAccountDto(Account account);

    Account mapToAccount(AccountDto accountDto);

    Account map(AccountDto accountDto);

    AccountDto map(Account account);

    List<AccountDto> map(Iterable<Account> account);

    List<Account> mapDtos(Iterable<AccountDto> accountDto);

}

