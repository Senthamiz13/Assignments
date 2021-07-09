public class current extends bank{

    int cctotal;

    public current(int account_No, String name, int amount, String acc_type) {
        super(account_No, name, amount, acc_type);
        updateccamount(this.amount);
    }
    void updateccamount(){

        ///////////// method overloading
    }
    void updateccamount(int cc){
       cctotal += cc;
    }
}
