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

@Component
@RequiredArgsConstructor
public class AccountPortImpl implements AccountPort {

    private final AccountRepository repository;

    @Override
    public List<Account> findAllAccounts() {
        var response=new ArrayList<Account>();
        for(var entity:repository.findAll()){
            response.add(AccountEntityMapper.INSTANCE.domainToModel(entity));
        }
        return response;
    }
}
