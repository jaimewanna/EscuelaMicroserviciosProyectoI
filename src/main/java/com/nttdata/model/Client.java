package com.nttdata.model;

import com.nttdata.model.utils.ClientType;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Client {

    private Integer id;
    private ClientType clientType;
    private String firstName;
    private String lastName;
    private String dni;
    private String ruc;

}
