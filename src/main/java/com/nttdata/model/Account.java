package com.nttdata.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Account {  //Serán los pasivos

    private Integer id;
    private String accountType;
    private Double balance;
    private Double maintenanceFee;
    private Integer monthlyMovements;
    private Integer clientId;

}
