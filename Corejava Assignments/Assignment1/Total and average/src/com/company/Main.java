package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int [] firstStudentMarks = new int[3];
        int [] secondStudentMarks = new int[3];
        int [] thirdStudentMarks = new int[3];

        float  firstStudentTotal = 0.0f, secondStudentTotal = 0.0f , thirdStudentTotal = 0.0f ;
        float  totalInA= 0.0f ,totalInB = 0.0f , totalInC= 0.0f;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the 3 subjects mark of first student: ");
        for(int i=0;i<firstStudentMarks.length;i++){
            int marks = input.nextInt();
            firstStudentMarks[i] = marks;
        }

        System.out.println("Enter the 3 subjects mark of Second student: ");
        for(int i=0;i<secondStudentMarks.length;i++){
            int marks = input.nextInt();
            secondStudentMarks[i] = marks;
        }
        System.out.println("Enter the 3 subjects mark of third student: ");
        for(int i=0;i<thirdStudentMarks.length;i++){
            int marks = input.nextInt();
            thirdStudentMarks[i] = marks;
        }
        totalInA = (firstStudentMarks[0]+ secondStudentMarks[0]+ thirdStudentMarks[0]);
        totalInB = (firstStudentMarks[1]+ secondStudentMarks[1]+ thirdStudentMarks[1]);
        totalInC = (firstStudentMarks[2]+ secondStudentMarks[2]+ thirdStudentMarks[2]);

        for(int i=0; i < 3; i++){
            firstStudentTotal += firstStudentMarks[i];
            secondStudentTotal += secondStudentMarks[i];
            thirdStudentTotal += thirdStudentMarks[i];
        }


        System.out.println("Total score in Subject A: "+totalInA);
        System.out.println("Total score in Subject B: "+totalInB);
        System.out.println("Total score in Subject C: "+totalInC);

        System.out.println("Average in Subject A: "+totalInA/3);
        System.out.println("Average in Subject B: "+totalInB/3);
        System.out.println("Average in Subject C: "+totalInC/3);

        System.out.println("Total marks of First Student: "+firstStudentTotal);
        System.out.println("Total marks of Second Student: "+secondStudentTotal);
        System.out.println("Total marks of Third Student: "+thirdStudentTotal);

        System.out.println("Average mark of First Student: "+firstStudentTotal/3);
        System.out.println("Average mark of Second Student: "+secondStudentTotal/3);
        System.out.println("Average mark of third Student "+thirdStudentTotal/3);


    }
}
