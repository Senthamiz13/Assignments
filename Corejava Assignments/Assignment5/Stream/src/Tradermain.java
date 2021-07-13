import java.util.*;
import java.util.stream.Collectors;

public class Tradermain {
    public static void main(String[] args) {

        List<Trader> mylistoftraders = Arrays.asList(
                new Trader("Kavi", "Pondicherry"),
                new Trader("Naveen", "Chennai"),
                new Trader("Nihal", "Pondicherry"),
                new Trader("Kishore", "Pune"),
                new Trader("Abi", "Pune"),
                new Trader("Jai", "Bangalore"),
                new Trader("Lilly","Indore")

        );

        Set result = mylistoftraders.stream().collect(Collectors.groupingBy(Trader::getCity, Collectors.counting())).keySet();
        System.out.println("Cities where the traders work: "+result);

        /////https://www.tutorialspoint.com/java8/java8_streams.htm

        ////////////Find all traders from Punea nd sort them by name

        List result1 = mylistoftraders.stream()
                .filter(s->s.city.equals("Pune"))
                .map(Trader::getName)
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Traders from Pune and sort them by name: "+result1);

        ///Return a string of all traders’ names sorted alphabetically

        System.out.println("---------------------");

        mylistoftraders.stream()
                .map(Trader::getName)
                .sorted()
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("---------------------");

        Optional<Trader> result3 = mylistoftraders.stream().filter(s->s.city.equals("Indore")).findAny();
        System.out.println(result3);
    }
}