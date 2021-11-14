package com.nttdata.proxy;

import com.nttdata.model.Account;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class AccountProxy {

    public Stream<Account> accountsGet() {
        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account(1, "Ahorro",1200.00,0.0,4,4));
        accounts.add(new Account(2, "Cuenta Corriente",2400.00,5.4,0,5));
        accounts.add(new Account(3, "Plazo Fijo",5000.00,0.0,1,6));

        return accounts.stream();
    }



}
