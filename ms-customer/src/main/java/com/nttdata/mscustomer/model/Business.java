package com.nttdata.mscustomer.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Business extends Customer{
    private String businessName;

    public Business(String id, String numberDocument, String email, String address, String phone, String businessName) {
        super(id, numberDocument, email, address, phone);
        this.businessName = businessName;
    }

    
}
