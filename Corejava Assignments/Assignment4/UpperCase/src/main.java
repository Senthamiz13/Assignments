import java.util.ArrayList;
import java.util.function.UnaryOperator;

public class main {
    public static void main(String[] args) {

        ArrayList<String> mylist = new ArrayList<String>();

        mylist.add("Sasi kamar");
        mylist.add("Aki");
        mylist.add("Karna");
        mylist.add("Susa");

        UnaryOperator<String> myupper= (string) -> string.toUpperCase();

        mylist.replaceAll((e->myupper.apply(e)));

        System.out.println(mylist);
    }
}
