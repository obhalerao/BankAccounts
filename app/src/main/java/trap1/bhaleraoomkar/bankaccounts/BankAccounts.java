package trap1.bhaleraoomkar.bankaccounts;

import java.util.*;

public class BankAccounts {

    private BankAccount[] accs;

    public BankAccounts(){}

    public BankAccounts(int numAccs){
        accs = new BankAccount[numAccs];
        for(int i = 0; i < numAccs; i++){
            accs[i] = new BankAccount("defaultName", (long)(Math.random()*1000000));
        }
    }

    public void setBankAccount(BankAccount acc, int pos){
        accs[pos] = acc;
    }

    public BankAccount[] getAccs(){
        return accs;
    }

    public BankAccount getAcc(int pos){
        return accs[pos];
    }

}
