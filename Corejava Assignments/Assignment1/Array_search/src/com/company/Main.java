package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int array[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        boolean flag = false;

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter a number to be searched in a array: ");
        int number = input.nextInt();
        //System.out.println(number);
        for (int i = 0; i < array.length; i++) {
            if (number == array[i] ) {
                flag = true;
                break;
            }
            else {
                flag  = false;
            }
            }
        System.out.println(flag);
        }

    }
