package com.nttdata.service;

import com.nttdata.proxy.AccountProxy;

public class OperationService {

    private AccountProxy accountProxy;

    public  OperationService(){
        accountProxy = new AccountProxy();
    }

}
