package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int first,second,third;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Marks of First subject: ");
        first = input.nextInt();

        System.out.print("Enter the Marks of Second subject: ");
        second = input.nextInt();

        System.out.print("Enter the Marks of Third subject: ");
        third = input.nextInt();


        if((first>60)&&(second>60)&&(third>60)){
            System.out.println("Result: PASS");
        }
        else if((first>60)&&(second>60)&&(third<60) ||
                (first>60)&&(second<60)&&(third>60) ||
                (first<60)&&(second>60)&&(third>60)){
            System.out.println("Result: PROMOTED");
        }
        else if((first>60)&&(second<60)&&(third<60) ||
                (first<60)&&(second>60)&&(third<60) ||
                (first<60)&&(second>60)&&(third>60) ||
                (first<60)&&(second<60)&&(third<60)){
            System.out.println("Result: FAIL");
        }
    }
}
