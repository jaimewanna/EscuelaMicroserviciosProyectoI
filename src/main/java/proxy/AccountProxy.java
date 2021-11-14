package proxy;

import com.nttdata.model.Account;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
public class AccountProxy {
    public Stream<Account> accountsGet() {
        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account(1, "Ahorro",1200.00,0.0,4,1));
        accounts.add(new Account(1, "Cuenta Corriente",2400.00,5.4,0,2));
        accounts.add(new Account(1, "Plazo Fijo",5000.00,0.0,1,3));

        return accounts.stream();
    }

}
