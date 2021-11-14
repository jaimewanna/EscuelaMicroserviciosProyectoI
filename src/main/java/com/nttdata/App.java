package com.nttdata;

import com.nttdata.model.Client;
import com.nttdata.model.utils.ClientType;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Client client = new Client(1, ClientType.EMPRESARIAL, "Pablo","Zúñiga", "74660496","20604607711");
    }
}
