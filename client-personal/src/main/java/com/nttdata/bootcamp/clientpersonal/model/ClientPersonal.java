package com.nttdata.bootcamp.clientpersonal.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@AllArgsConstructor
@NoArgsConstructor
// @Slf4j
public class ClientPersonal {

    private String id;
    private String firstname;
    private String lastname;
    private String email;
    private String phone;
    private String address;
}
