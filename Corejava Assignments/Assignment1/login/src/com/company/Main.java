package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        for (int errorAttempts = 1; errorAttempts <=3; errorAttempts++) {
            System.out.print("Enter Username: ");
            String user = input.nextLine();

            System.out.print("Enter Password: ");
            String pass = input.nextLine();

            if (user.equals("Mark") && pass.equals("Mark@123")) {
                System.out.println("Welcome " + user);
                break;
            } else{
                System.out.println("incorrect user id or password \n Remaining attempts "+ (3-errorAttempts));
                if(errorAttempts >= 3){
                    System.out.println("Contact Admin");
                }
            }
        }
    }
}
