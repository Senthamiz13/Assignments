import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class main {
    public static void main(String[] args) {
        List<order> mylist = Arrays.asList(
                new order("accepted", 15000,"Ram"),
                new order("completed", 12000,"Sasi"),
                new order("accepted", 9000,"Sid"),
                new order("completed", 7000,"lal")
        );
        System.out.println("Orders price more than 10000");
        conditionally(mylist,p -> p.price> 10000);

        System.out.println("orders accepted");
        conditionally(mylist,p ->p.status.equals("accepted"));

        System.out.println("order completed");
        conditionally(mylist,p ->p.status.equals("completed"));
    }
        private static void conditionally(List<order> mylist, Predicate<order> mypre) {
            for (order p:mylist) {
                if (mypre.test(p)){
                    System.out.println("Name: "+p.name);
                }
            }
    }
}
