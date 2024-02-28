package com.nttdata.bootcamp.clientbusiness.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
// @Slf4j
public class ClientBusiness {

    private String id;
    private String businessName;
    private String phone;
    private String address;
    private String email;
}
