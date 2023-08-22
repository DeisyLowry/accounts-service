package com.ttrc.accounts.dto;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AccountDto {

    //private Integer id;
    private String accountname;
    private String accounttype;

    private String brokername;
    private String accountbalance;

    private String description;
    private Integer isactive;

}
