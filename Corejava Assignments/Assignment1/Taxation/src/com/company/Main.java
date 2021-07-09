package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input  = new Scanner(System.in);
        System.out.print("Enter the CTC: ");
        int salary = input.nextInt();
        input.close();
        if((salary>=0)&&(salary<=180000)){
            System.out.println("Tax amount: NIL");
        }
        else if((salary>=181001)&&(salary<=300000)){
            System.out.println("Tax amount:"+(0.1*salary));
        }
        else if((salary>=300001)&&(salary<=500000)){
            System.out.println("Tax amount:"+(0.2*salary));
        }
        else if((salary>=500000)&&(salary<=1000000)){
            System.out.println("Tax amount:"+(0.3*salary));
        }
    }
}
