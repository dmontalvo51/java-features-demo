package com.globant.services;

import com.globant.domain.Account;
import com.globant.ports.AccountPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountsService {

    private final AccountPort port;

    @Override
    public List<Account> findAllAccounts() {
        return port.findAllAccounts();
    }
}
