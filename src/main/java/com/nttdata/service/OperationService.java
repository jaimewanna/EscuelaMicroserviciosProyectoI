package com.nttdata.service;

import com.nttdata.model.Account;
import com.nttdata.proxy.AccountProxy;
import com.nttdata.proxy.MovementsProxy;
import com.nttdata.proxy.ClientProxy;

import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.Optional;
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

    public void getAllProductBalanceClient(int clientId){
        accountProxy.accountsGet()
                .filter(account -> account.getClientId().equals(clientId))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    public void getAllMovementsFromAccount(int accountId){
        movementsProxy.getAllMovements()
                .filter(movements -> movements.getAccountId().equals(accountId))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
   public void getDepositById(int clientId, Double deposit){
       DoubleSummaryStatistics newbalance = accountProxy.accountsGet()
               .filter(account -> account.getClientId().equals(clientId))
               .collect(Collectors.summarizingDouble(Account::getBalance));
       Double newdeposit = (newbalance.getSum()+deposit);
       System.out.println(newdeposit);

   }

}
