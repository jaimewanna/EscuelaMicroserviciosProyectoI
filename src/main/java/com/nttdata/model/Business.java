package com.nttdata.model;
import com.nttdata.model.utils.ClientType;
import lombok.AllArgsConstructor ;
import lombok.Data;

import java.util.List;
@Data
@AllArgsConstructor
public class Business extends Client{
    private String businessName;
    private String ruc;
    private List<Product> productList;

    public Business (Integer id, ClientType clientType, String firstName, String lastName) {
        super(id, clientType, firstName, lastName);
    }
}
