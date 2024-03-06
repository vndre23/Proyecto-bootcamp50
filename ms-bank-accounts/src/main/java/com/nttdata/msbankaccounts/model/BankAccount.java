package com.nttdata.msbankaccounts.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public abstract class BankAccount {

    private String id;
    private float commission;
    private float amount;
    private int movementLimit;
    private String customerId;
}
