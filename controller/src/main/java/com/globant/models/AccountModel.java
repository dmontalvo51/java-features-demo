package com.globant.models;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class AccountModel {

    private String accountId;
    private String type;
    private BigDecimal balance;
    private String firstName;
    private String lastName;

}
