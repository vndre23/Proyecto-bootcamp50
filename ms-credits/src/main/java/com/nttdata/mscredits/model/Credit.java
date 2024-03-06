package com.nttdata.mscredits.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public abstract class Credit {

    private String id;
    private float amount;
    private float balance;
    private Date dateIssue;
    private String customerId;
}
