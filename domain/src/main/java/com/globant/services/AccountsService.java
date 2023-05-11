package com.globant.services;

import com.globant.domain.Account;

import java.math.BigDecimal;
import java.util.List;

public interface AccountsService {
    private Account mockAccount(){
        return Account.builder()
                .accountId("8980000001")
                .balance(BigDecimal.ZERO)
                .firstName("Mock")
                .lastName("Account")
                .type("MockAccount")
                .build();
    }

    default Account createMockAccount(){
        return mockAccount();
    }

    List<Account> findAllAccounts();
}
