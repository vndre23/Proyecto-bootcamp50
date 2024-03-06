package com.nttdata.mscustomer.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class Personal extends Customer{

    private String firstName;
    private String lastName;

    public Personal(String id, String numberDocument, String email, String address, String phone, String firstName,
            String lastName) {
        super(id, numberDocument, email, address, phone);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    

    





}
