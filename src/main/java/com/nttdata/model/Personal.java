package com.nttdata.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Personal extends Client{
    private Integer clientId;
    private String firstName;
    private String lastName;
    private String dni;
    private Integer numberAccounts;
}
