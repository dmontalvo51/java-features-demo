package com.globant.models;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class AccountListModel {

    private List<AccountModel> accounts;
}
