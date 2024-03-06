package com.nttdata.msbankaccounts.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class SavingAccount extends BankAccount{

    public SavingAccount(String id, float commission, float amount, int movementLimit, String customerId) {
        super(id, commission, amount, movementLimit, customerId);
    }

}
