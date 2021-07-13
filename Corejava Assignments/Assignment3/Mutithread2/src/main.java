import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class main {

    static class failfast extends Thread {
        public void run() {
            Map monthIndex = new HashMap();
            monthIndex.put("1", "January");
            monthIndex.put("2", "February");
            monthIndex.put("3", "March");

            Iterator iterator = monthIndex.keySet().iterator();

            while (iterator.hasNext()) {
                System.out.println(monthIndex.get(iterator.next()));
                monthIndex.put("4", "April --Hashmap");
            }
        }
    }



    static class failsafe extends Thread {
        public void run() {
            ConcurrentMap monthIndex1 = new ConcurrentHashMap();
            monthIndex1.put("1", "January");
            monthIndex1.put("2", "February");
            monthIndex1.put("3", "March");

            Iterator iterator = monthIndex1.keySet().iterator();

            while (iterator.hasNext()) {
                System.out.println(monthIndex1.get(iterator.next()));
                monthIndex1.put("4", "April  -- concurrent Hash map");
            }
        }
    }




    public static void main(String args[]) {
        failfast t1 = new failfast();
        failsafe t2 = new failsafe();

        t1.start();
        t2.start();
    }
}
