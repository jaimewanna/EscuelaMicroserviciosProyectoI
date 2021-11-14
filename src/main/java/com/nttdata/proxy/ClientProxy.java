package com.nttdata.proxy;

import com.nttdata.model.Business;
import com.nttdata.model.Client;
import com.nttdata.model.Personal;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ClientProxy {


    public Stream<Business> businessGetAll() {
        List<Business> clients = new ArrayList<Business>();

        clients.add(new Business(1, "A","20604607711"));
        clients.add(new Business(2, "B", "20604607712"));
        clients.add(new Business(3, "C", "20604607713"));

        return clients.stream();
    }

    public Stream<Personal> personalGetAll(){
        List<Personal> people = new ArrayList<Personal>();

        people.add(new Personal(4,"Jaime","Reyna","70526066",1));
        people.add(new Personal(5,"Pablo","Zuñiga","95685247",2));
        people.add(new Personal(6,"Oriana","Ramirez","69256498",3));

        return people.stream();
    }
}
