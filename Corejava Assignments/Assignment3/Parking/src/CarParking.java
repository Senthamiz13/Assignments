import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CarParking {
    static ArrayList<Parked_CarOwnerList> firstFloor = new ArrayList<Parked_CarOwnerList>();
    static ArrayList<Parked_CarOwnerList> secondFloor = new ArrayList<Parked_CarOwnerList>();
    static ArrayList<Parked_CarOwnerList> thirdFloor = new ArrayList<Parked_CarOwnerList>();
    static Map<Integer, String> parkedCarList = new HashMap<Integer, String>();

    Parked_CarOwnerList parked_ownerlst;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            int ch = 0;
            System.out.println("Space Available for First Floor " + (80 - firstFloor.size()));
            System.out.println("Space Available for Second Floor " + (80 - secondFloor.size()));
            System.out.println("Space Available for Third Floor " + (80 - secondFloor.size()));

            System.out.println("1.To park ADD owner details");
            System.out.println("2.Show parked Car No's ");
            System.out.println("3.Remove car from parking");

            System.out.print("Enter your response: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    Parked_owner_det cp = new Parked_owner_det();
                    cp.insertOwner();
                    if (parkedCarList.size() < 240) {
                        if (firstFloor.size() < 80) {

                            Parked_CarOwnerList p1 = new Parked_CarOwnerList(cp, "First Floor " + firstFloor.size());
                            firstFloor.add(p1);
                            parkedCarList.put(p1.details.getCar_no(), p1.getLocation());


                        } else if (secondFloor.size() < 80) {
                            Parked_CarOwnerList p1 = new Parked_CarOwnerList(cp, "Second Floor " + secondFloor.size());
                            secondFloor.add(p1);
                            parkedCarList.put(p1.details.getCar_no(), p1.getLocation());
                        } else if (thirdFloor.size() < 80) {
                            Parked_CarOwnerList p1 = new Parked_CarOwnerList(cp, "Third Floor " + thirdFloor.size());
                            thirdFloor.add(p1);
                            parkedCarList.put(p1.details.getCar_no(), p1.getLocation());
                        } else {
                            System.out.println("No Space Available");

                        }

                    }
                    break;

                case 2:
                    for (Map.Entry mp : parkedCarList.entrySet()) {
                        System.out.println("Car No " + mp.getKey() + " Parked At " + mp.getValue());
                    }
                    break;

                case 3:
                    System.out.print("enter the car no  to remove");
                    int no = sc.nextInt();
                    System.out.print("enter the car location");
                    System.out.print("if first floor press 1");
                    System.out.print("if second floor press 2");
                    System.out.print("if third floor press 3");
                    int loc = sc.nextInt();
                    switch (loc) {
                        case 1:
                            parkedCarList.remove(no);
                            //firstFloor.remove(no);
                            break;
                        case 2:
                            //secondFloor.remove(no);
                            break;
                        case 3:
                            thirdFloor.remove(no);
                            break;

                        default:
                            System.out.println("your car has not been Parked........\n Please Check once Again");

                    }


            }


            System.out.print("Do you want to continue.... press 1 for YES, 0 for  NO");
            choice = sc.nextInt();

        }
        while (choice != 0);
    }

}
