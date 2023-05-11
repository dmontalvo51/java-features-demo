package com.globant.services;

import com.globant.domain.Account;
import com.globant.ports.AccountPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountsService {

    private final AccountPort port;

    @Override
    public List<Account> findAllAccounts() {
        var response=port.findAllAccounts()
                .stream()
                .takeWhile(account -> !account.getType().equals("Checking"))
                .collect(Collectors.toList());
        response.addAll(List.of(createMockAccount()));
        return response;
    }
}
