import java.util.LinkedHashSet;
import java.util.Iterator;

public class linkedHashset {
    public static void main(String[] args) {
        LinkedHashSet<String> names = new LinkedHashSet();

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