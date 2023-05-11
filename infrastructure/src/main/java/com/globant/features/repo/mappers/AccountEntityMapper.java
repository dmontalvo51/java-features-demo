package com.globant.features.repo.mappers;

import com.globant.domain.Account;
import com.globant.features.entities.AccountEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AccountEntityMapper {

    AccountEntityMapper INSTANCE = Mappers.getMapper(AccountEntityMapper.class);

    Account domainToModel(AccountEntity entity);
}
