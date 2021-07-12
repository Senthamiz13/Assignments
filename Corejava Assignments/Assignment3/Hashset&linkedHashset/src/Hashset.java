import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<String>();

        names.add("Abi");
        names.add("Bala");
        names.add("Charu");
        names.add("Dinesh");

        Iterator<String> i = names.iterator();

        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}