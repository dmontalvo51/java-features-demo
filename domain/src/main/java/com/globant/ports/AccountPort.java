package com.globant.ports;

import com.globant.domain.Account;

import java.util.List;

public interface AccountPort {

    List<Account> findAllAccounts();

}
