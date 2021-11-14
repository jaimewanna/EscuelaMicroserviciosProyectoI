package com.nttdata.proxy;

import com.nttdata.model.Client;

public class ClientProxy {

    public List<Client> getAll() {
        List<Client> client = new ArrayList<>();
        client.add(new Client(1,));


        return client;
    }
}
