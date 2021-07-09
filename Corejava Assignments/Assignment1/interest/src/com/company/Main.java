package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float principle, rate, time, number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Principle amount: ");
        principle  = input.nextFloat();  //getting input number
        System.out.print("Enter the rate of interest in %: ");
        rate = input.nextFloat();
        System.out.print("Enter the time: ");
        time = input.nextFloat();
        System.out.print("Number of times interest applied per time period: ");
        number = input.nextFloat();

        float SI = ((principle*rate/100*time));

        double CI = principle*Math.pow((1+(rate/100)/number),number*time);

        System.out.println("Calculated Simple Interest: "+SI);
        System.out.println("Calculated Compound Interest: "+CI);

    }
}
