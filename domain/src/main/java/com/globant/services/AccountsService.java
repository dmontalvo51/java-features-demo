package com.globant.services;

import com.globant.domain.Account;

import java.util.List;

public interface AccountsService {

    List<Account> findAllAccounts();
}
