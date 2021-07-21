package spring.q3;

public class BankAccountController implements BankAccountService{
    @Override
    public double withdraw(long accountId, double balance) {
        System.out.println("Withdraw using name");
        return 0;
    }

    @Override
    public double deposit(long accountId, double balance) {
        return 0;
    }

    @Override
    public double getBalance(long accountId) {
        return 0;
    }

    @Override
    public boolean fundTransfer(long fromAccount, long toAccount, double amount) {
        return false;
    }
}
