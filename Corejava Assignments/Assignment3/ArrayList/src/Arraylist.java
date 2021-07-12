import java.util.ArrayList;
import java.util.ListIterator;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();

        names.add("Mohanlal");
        names.add("Sivasankar");
        names.add("Mansoor");
        names.add("Madhavan");
        names.add("Arvind");
        names.add("Amir");

        ListIterator<String> i= names.listIterator(names.size()); /// need for reversing through the iteration

        while(i.hasPrevious()){
            System.out.println(i.previous());
        }
       // System.out.println(names);
    }
}
