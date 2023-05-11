package com.globant.controllers;

import com.globant.controllers.mappers.AccountMapper;
import com.globant.domain.Account;
import com.globant.models.AccountListModel;
import com.globant.services.AccountsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/v1.0/features/accounts")
@RequiredArgsConstructor
public class AccountsController {
    private final AccountsService service;

    @GetMapping
    public ResponseEntity<AccountListModel> getAllAccounts() {
        List<Account> response = service.findAllAccounts();
        return ResponseEntity.ok(AccountListModel.builder()
                .accounts(response.stream()
                        .map(AccountMapper.INSTANCE::domainToModel)
                        .collect(Collectors.toList()))
                .build());
    }

}
