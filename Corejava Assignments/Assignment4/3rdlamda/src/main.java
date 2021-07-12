import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class main {
    public static void main(String[] args) {
        List<order> mylist = Arrays.asList(
                new order("accepted", 15000,"Ram"),
                new order("completed", 12000,"Sasi"),
                new order("accepted", 9000,"Sid"),
                new order("completed", 7000,"lal")
        );
        System.out.println("Orders price more than 10000");
        conditionally(mylist,p -> p.price> 10000, p-> System.out.println(p.name+" "+p.price),()-> "_____*_____",(p)->p.length() );

        System.out.println("orders accepted");
        conditionally(mylist,p ->p.status.equals("accepted"),p-> System.out.println(p.name+" "+p.status),()-> "_____*_____",(p)->p.length() );

        System.out.println("order completed");
        conditionally(mylist,p ->p.status.equals("completed"),p-> System.out.println(p.name+" "+p.status),()-> "_____*_____",(p)->p.length() );
    }
    private static void conditionally(List<order> mylist, Predicate<order> mypre, Consumer<order>mycon, Supplier<String>mysup, Function<String,Integer> myfunc) {
        for (order p:mylist) {
            if (mypre.test(p)) //precate used
            {
                mycon.accept(p);//consumers used
                System.out.println("no of char in name "+p.name+":"+myfunc.apply(p.name));///Funtion used
            }
        }
        System.out.println(mysup.get()); ///supplier used
    }
}
