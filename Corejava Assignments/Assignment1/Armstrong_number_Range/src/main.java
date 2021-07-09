import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        int start, end,temp, remainder ;

        System.out.print("Enter the Start of Range: ");
        Scanner input = new Scanner(System.in);

        start = input.nextInt();  //getting start number

        System.out.print("Enter the end of Range: ");
        end = input.nextInt();
        input.close();
        System.out.print(" Armstrong Numbers: ");
        for(int i = start; i<= end; ++i) {

            temp =  i;
            int result = 0;
            //System.out.println("temp: "+temp);
            while(temp != 0) {
                remainder = temp % 10;
                result += Math.pow(remainder, 3);
                temp /= 10;
            }
            if(i == result){
                System.out.println(" "+i);
            }
        }
    }
}
