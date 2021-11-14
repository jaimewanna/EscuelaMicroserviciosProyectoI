package com.nttdata.proxy;

import com.nttdata.model.Movements;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MovementsProxy {

    public Stream<Movements> getAllMovements(){
        List<Movements> movements = new ArrayList<Movements>();

        movements.add(new Movements(4,1,"deposit", new BigDecimal(100)));
        movements.add(new Movements(4,1,"withdrawal", new BigDecimal(90)));
        movements.add(new Movements(5,2,"deposit", new BigDecimal(110)));
        movements.add(new Movements(5,2,"withdrawal", new BigDecimal(80)));
        movements.add(new Movements(6,3,"deposit", new BigDecimal(120)));
        movements.add(new Movements(6,3,"withdrawal", new BigDecimal(70)));

        return movements.stream();

    }
}
