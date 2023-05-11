package com.globant.domain;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class Account {
    private String accountId;
    private String type;
    private BigDecimal balance;
    private String firstName;
    private String lastName;
}
