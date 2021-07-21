package spring.q3;

public class BankAccountRepositoryImpl implements BankAccountRepository{

    @Override
    public double getBalance(long accountId) {

        System.out.println("getbalance in BankAccountRepositoryImpl using type");
        return 0;
    }

    @Override
    public double updateBalance(long accountId, double newBalance) {
        return 0;
    }
}
