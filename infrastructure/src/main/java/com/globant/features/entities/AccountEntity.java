package com.globant.features.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity(name = "account")
@Data
@NoArgsConstructor
public class AccountEntity {
    @Id
    @GeneratedValue
    private String id;
    private String accountId;
    private String type;
    private BigDecimal balance;
    private String firstName;
    private String lastName;

}
