package com.globant.features.repo;

import com.globant.domain.Account;
import com.globant.features.entities.AccountEntity;
import com.globant.features.jpa.AccountRepository;
import com.globant.features.repo.mappers.AccountEntityMapper;
import com.globant.ports.AccountPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class AccountPortImpl implements AccountPort {

    private final AccountRepository repository;

    @Override
    public List<Account> findAllAccounts() {

        var list= repository.findAll()
                .stream()
                .map(AccountEntityMapper.INSTANCE::domainToModel)
                .filter(Predicate.not(account ->
                        account.getType().isBlank()))
                .collect(Collectors.toList());
        list.forEach(account->{
                    account.setFirstName(account
                            .getFirstName().strip());
                    account.setLastName(account
                            .getLastName().strip());
                });


        return list;
    }
}
