package trap1.bhaleraoomkar.bankaccounts;

public class BankAccount {

    private long balance;
    private String name;

    public BankAccount(String name, long Balance){
        this.balance = balance;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public long getBalance() {
        return balance;
    }
}
