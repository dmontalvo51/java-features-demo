package com.globant.controllers.mappers;

import com.globant.domain.Account;
import com.globant.models.AccountModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AccountMapper {
    AccountMapper INSTANCE = Mappers.getMapper(AccountMapper.class);

    AccountModel domainToModel(Account account);

}
