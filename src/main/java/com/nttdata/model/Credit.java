package com.nttdata.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Credit {   //Serán los activos

    private int id;
    private String creditType;
    private int clientId;

}
