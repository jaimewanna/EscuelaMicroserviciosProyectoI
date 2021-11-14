package com.nttdata.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Movements {

    private Integer clientId;
    private Integer accountId;
    private String description;
    private BigDecimal amount;

}
