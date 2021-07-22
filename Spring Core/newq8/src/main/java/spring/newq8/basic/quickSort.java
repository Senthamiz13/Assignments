package spring.newq8.basic;

import org.springframework.stereotype.Component;

@Component
public class quickSort implements sort {
        public int[] sort(int[] number ){
            System.out.println("quicksort");
            return number;
        }
}
