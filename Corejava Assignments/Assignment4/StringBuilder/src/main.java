import java.util.ArrayList;
import java.util.function.Consumer;

public class main {
    public static void main(String[] args) {
        ArrayList<String> mylist = new ArrayList<String>();

        mylist.add("Sasi");
        mylist.add("Aki");
        mylist.add("Karna");
        mylist.add("Susa");

        StringBuilder mystring = new StringBuilder();

        Consumer<String> mycon = (i) -> mystring.append(i.charAt(0));

        for (String i: mylist){
            //mystring.append(i.charAt(0));
            mycon.accept(i);
        }
        System.out.println(mystring);
    }
}
