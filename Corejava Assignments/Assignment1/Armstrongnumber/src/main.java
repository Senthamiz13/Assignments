
import java.util.Scanner;

//// Armstrong number////
public class main {
    public static void main(String[] args){

        int result = 0, remainder, checker ;   //declaration

        Scanner input = new Scanner(System.in);

        System.out.println("Finding Armstrong Number");
        System.out.print("Enter the number: ");

        int number = input.nextInt();  //getting input number
        checker = number;

        int length = (int) (Math.log10(number) + 1); // finding lenth of the given number

        while(number != 0){
            remainder = number % 10;
            result += Math.pow(remainder, length);
            number /= 10;
            //System.out.println("number :"+ number);
        }
        if(result == checker){
            System.out.println("The number entered is Armstrong Number");
        }
        else{
            System.out.println("The number entered is not Armstrong Number");
        }

    }
}
