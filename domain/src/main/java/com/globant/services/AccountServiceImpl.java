package com.globant.services;

import com.globant.domain.Account;
import com.globant.ports.AccountPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountsService {

    private final AccountPort port;

    @Override
    public List<Account> findAllAccounts() {
        List<Account> response=port.findAllAccounts();
        response.addAll(List.of(mockAccount()));
        return response;
    }

    /**
     * Creating a Mock Account to test the List static methods
     */
    private Account mockAccount(){
        return Account.builder()
                .accountId("8980000001")
                .balance(BigDecimal.ZERO)
                .firstName("Mock")
                .lastName("Account")
                .type("MockAccount")
                .build();
    }

}
