import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 1 for customer or 2 for owner: ");
        int number = input.nextInt();
        if(number == 1) {
            System.out.print("Enter 1 for andy or 2 for cookie or 3 for icecream to purchase");
            int item = input.nextInt();
            System.out.println("The cost of the item is rs"+customer.getCost(item));
        }
         else if(number == 2) {
             owner.update();
        }
        }
}
