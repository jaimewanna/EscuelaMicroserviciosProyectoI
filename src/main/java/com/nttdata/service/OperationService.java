package com.nttdata.service;

import com.nttdata.proxy.AccountProxy;
import com.nttdata.proxy.MovementsProxy;
import com.nttdata.proxy.ClientProxy;

import java.math.BigDecimal;
import java.util.stream.Collectors;

public class OperationService {

    private AccountProxy accountProxy;
    private MovementsProxy movementsProxy;
    private ClientProxy clientProxy;

    public  OperationService(){
        accountProxy = new AccountProxy();
        movementsProxy = new MovementsProxy();
        clientProxy = new ClientProxy();
    }

    //Se traen todas las cuentas bancarias, se filtran por el id del cliente, se convierten en lista y se muestran
    public void getAllProductBalanceClient(int clientId){
        accountProxy.accountsGet()
                .filter(account -> account.getClientId().equals(clientId))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    //Se trae la relación de todos los movimientos, luego se fitlran por id de la cuenta y se muestran
    public void getAllMovementsFromAccount(int accountId){
        movementsProxy.getAllMovements()
                .filter(movements -> movements.getAccountId().equals(accountId))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    //Se traen todos los creditos, se obtiene la tarjeta por su id, se revisa si el consumo mas el monto actual
    //son menores que el limite y en ese caso se imprime el nuevo monto
    public void addConsumetoCard(int cardId, Double consume){
        accountProxy.creditsGetAll()
                .filter(credit -> credit.getId().equals(cardId))
                .filter(credit ->  credit.getAmount()+consume < credit.getLimit())
                .forEach(credit -> System.out.println(credit.getAmount()+consume));

    }

}
