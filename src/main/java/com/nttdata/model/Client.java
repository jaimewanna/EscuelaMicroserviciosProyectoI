package com.nttdata.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Client {

    private Integer id;
    private String clientType;
    private String name;
    private String dni;
    private String ruc;

}
