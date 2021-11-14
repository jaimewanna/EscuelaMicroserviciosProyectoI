package com.nttdata.model;
import lombok.AllArgsConstructor ;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
public class Business extends Client{

    private Integer clientId;
    private String businessName;
    private String ruc;
}
