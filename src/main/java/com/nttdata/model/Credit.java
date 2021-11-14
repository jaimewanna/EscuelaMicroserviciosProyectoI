package com.nttdata.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor

public class Credit {   //Serán los activos

    private Integer id;
    private String creditType;
    private Integer clientId;
    private Double amount;
    private Double limit;

}
