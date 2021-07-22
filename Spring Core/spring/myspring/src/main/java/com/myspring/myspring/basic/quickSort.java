package com.myspring.myspring.basic;

import org.springframework.stereotype.Component;

@Component
public class quickSort implements sort {
        public int[] sort(int[] number ){
            System.out.println("quicksort");
            return number;
        }
}
