public class SavingsAccount implements Comparable<SavingsAccount>
{
    int acc_balance;
    int acc_id;
    String accHolderName;
    boolean isSalaryAccount;

    public SavingsAccount(int acc_balance, int acc_id, String accHolderName, boolean isSalaryAccount) {
        super();
        this.acc_balance = acc_balance;
        this.acc_id = acc_id;
        this.accHolderName = accHolderName;
        this.isSalaryAccount = isSalaryAccount;
    }

    public int getAcc_balance() {
        return acc_balance;
    }

    public void setAcc_balance(int acc_balance) {
        this.acc_balance = acc_balance;
    }

    public int getAcc_id() {
        return acc_id;
    }

    public void setAcc_id(int acc_id) {
        this.acc_id = acc_id;
    }

    public String getAccHolderName() {
        return accHolderName;
    }

    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }

    public boolean isSalaryAccount() {
        return isSalaryAccount;
    }

    public void setSalaryAccount(boolean isSalaryAccount) {
        this.isSalaryAccount = isSalaryAccount;
    }

    public void updateBalance(int num,int amt)
    {
        if(num==1)
        {
            acc_balance=acc_balance-amt;
        }
        else
        {
            acc_balance=acc_balance+amt;
        }
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "acc_balance=" + acc_balance +
                ", acc_id=" + acc_id +
                ", accHolderName='" + accHolderName + '\'' +
                ", isSalaryAccount=" + isSalaryAccount +
                '}';
    }

    @Override
    public int compareTo(SavingsAccount o) {
        if (this.acc_id > o.acc_id){return 1;}
        else if (this.acc_id<o.acc_id){return -1;}
        return 0;
    }
}