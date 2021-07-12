import java.util.ArrayList;
import java.util.function.Predicate;

public class main {
    public static void main(String[] args) {

        ArrayList<String> mylist = new ArrayList<String>();
        mylist.add("Sasi");
        mylist.add("Aki");
        mylist.add("Karna");
        mylist.add("Susa");

        mylist.removeIf(n -> (n.length()%2 != 0 ));

        //Predicate<String> pre = n -> (n.length()%2 != 0);
        //mylist.removeIf(pre);


        System.out.println(mylist);
    }
}
