package com.nttdata.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Account {

    private int id;
    private String accountType;
    private Double balance;
    private Double maintenanceFee;
    private int monthlyMovements;
    private int clientId;

}
