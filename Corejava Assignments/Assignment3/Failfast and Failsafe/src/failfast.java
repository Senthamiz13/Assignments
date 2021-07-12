import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class failfast {

    public static void main(String[] args) {
        Map monthIndex = new HashMap();
        monthIndex.put("1", "January");
        monthIndex.put("2", "February");
        monthIndex.put("3","March");

        Iterator iterator = monthIndex.keySet().iterator();

        while (iterator.hasNext()) {
            System.out.println(monthIndex.get(iterator.next()));
            //adding an element to Map
            //exception will be thrown on next call
            //of next() method.
            monthIndex.put("4", "April");
        }
    }
}