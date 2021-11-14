package com.nttdata;

import com.nttdata.model.Business;
import com.nttdata.model.Client;
import com.nttdata.model.Personal;
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
        operationService.addBusinessClient(new Business(7, "D","2060458771"));
        operationService.addPersonalClient(new Personal(8,"asdad","Reynsadsada","70586066",1));
        //operationService.getAllProductBalanceClient(4);
        //operationService.getAllMovementsFromAccount(1);
        operationService.addConsumetoCard(1,600.00);
    }
}
