public class savings extends bank{

    int fdTotal;

    public savings(int account_No, String name, int amount, String acc_type) {
        super(account_No, name, amount, acc_type);
        updatefdtotal(this.amount);
    }

    void updatefdtotal(){
        //method overloading
    }

    void updatefdtotal(int fd){
        fdTotal += fd;
    }
}
