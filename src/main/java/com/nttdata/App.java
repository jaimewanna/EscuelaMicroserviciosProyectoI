package com.nttdata;

import com.nttdata.model.Business;
import com.nttdata.model.Client;
import com.nttdata.service.OperationService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        OperationService operationService = new OperationService();

        //operationService.getAllProductBalanceClient(4);
        //operationService.getAllMovementsFromAccount(1);
        operationService.addConsumetoCard(1,600.00);
    }
}
