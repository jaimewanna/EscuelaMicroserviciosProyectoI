package com.nttdata.proxy;

import com.nttdata.model.Business;
import com.nttdata.model.Client;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ClientProxy {


    public Stream<Business> businessGetAll() {
        List<Client> clients = new ArrayList<Client>();

        Business a = new Business(1,"","",1, "A","20604607711");
        clients.add(a);
        clients.add(new Business(2, "B", "20604607712"));
        clients.add(new Business(3, "C", "20604607713"));

        return clients.stream();
    }
}
