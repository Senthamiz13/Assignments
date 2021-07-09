package com.company;

public class Main {

    public static void main(String[] args) {
        int array[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};

        System.out.println("Array before sorting");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++)
            {
                if(array[i]>array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("\nArray After sorting ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
