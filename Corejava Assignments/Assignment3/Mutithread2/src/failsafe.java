import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class failsafe {

    public static void main(String[] args) {
        ConcurrentMap monthIndex = new ConcurrentHashMap();
        monthIndex.put("1", "January");
        monthIndex.put("2", "February");
        monthIndex.put("3","March");

        Iterator iterator = monthIndex.keySet().iterator();

        while (iterator.hasNext()) {
            System.out.println(monthIndex.get(iterator.next()));
            monthIndex.put("4", "April");
        }
    }
}