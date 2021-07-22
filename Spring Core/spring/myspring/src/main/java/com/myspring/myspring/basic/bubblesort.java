package com.myspring.myspring.basic;

import org.springframework.stereotype.Component;

@Component
public class bubblesort implements sort {
        public int[] sort(int[] number ){

            System.out.println("bubblesort");
            return number;
        }
}
