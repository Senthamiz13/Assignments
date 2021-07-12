import java.util.*;

class Parked_owner_det{
    private String owner_name;
    private String carModel;
    private int car_no;
    private long car_mob_no;
    private String address;

    public Parked_owner_det(String owner_name, String carModel, int car_no, long car_mob_no, String address) {

        this.owner_name = owner_name;
        this.carModel = carModel;
        this.car_no = car_no;
        this.car_mob_no = car_mob_no;
        this.address = address;

    }
    public Parked_owner_det(){

    }


    public String getOwner_name() {
        return owner_name;
    }


    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }


    public String getCarModel() {
        return carModel;
    }


    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }


    public int getCar_no() {
        return car_no;
    }


    public void setCar_no(int car_no) {
        this.car_no = car_no;
    }


    public long getCar_mob_no() {
        return car_mob_no;
    }


    public void setCar_mob_no(long car_mob_no) {
        this.car_mob_no = car_mob_no;
    }


    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }


    public void insertOwner(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert owner name: ");
        String name = sc.nextLine();
        setOwner_name(name);
        System.out.print("set Car Model: ");
        String model = sc.nextLine();
        setCarModel(model);
        System.out.print("Insert car no: ");
        int carno = sc.nextInt();
        setCar_no(carno);
        System.out.print("enter mob no ");
        long o = sc.nextLong();
        setCar_mob_no(o);
        System.out.print("enter address ");
        String addr = sc.next();
        setAddress(addr);


    }


}

