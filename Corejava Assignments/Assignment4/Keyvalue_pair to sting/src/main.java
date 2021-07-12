import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class main {
    public static void main(String[] args) {

        HashMap<String,String> mymap = new HashMap<String,String>();
        mymap.put("Sasi","Kumar");
        mymap.put("Nikil","Rajesh");

        Set myset = mymap.entrySet();
        Iterator i = myset.iterator();

        StringBuilder myNewString = new StringBuilder();

        mymap.forEach((k,v) -> {
            myNewString.append(k);
            myNewString.append(v);
        });

        System.out.println(mymap);
        System.out.println(myNewString);
    }
}
