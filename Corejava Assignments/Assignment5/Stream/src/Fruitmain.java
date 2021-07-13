import java.util.*;
import java.util.stream.Collectors;

public class Fruitmain {
    public static void main(String[] args) {
        List<Fruit> myFruitlist = Arrays.asList(
                new Fruit("Orange",100,20,"orange"),
                new Fruit("Apple",60,40,"red"),
                new Fruit("lemon",20,10,"yellow"),
                new Fruit("papaya",120,35,"yellow"),
                new Fruit("Strawberry",95,95,"red")
        );
/////////////// Display  the  fruit  names  of  low  caloriesfruits  i.e.  calories  <  100  sorted  in descending order of calories.

        System.out.println("-----  calories  <  100  sorted  in descending order of calories-----");

        List<Fruit> result = myFruitlist.stream().filter(s->s.getCalories()<100).sorted(new Comparator<Fruit>() {
            @Override
            public int compare(Fruit o1, Fruit o2) {
                if(o2.getCalories()> o1.getCalories()) return 1;
                else return -1;
            }
        }).collect(Collectors.toList());
        result.forEach(System.out::println);

        /////Display colorwise list of fruit names.

        System.out.println("-------------- colorwise list of fruit names------------------");

        List<Fruit> result1 = myFruitlist.stream().sorted(new Comparator<Fruit>() {
            @Override
            public int compare(Fruit o1, Fruit o2) {
                if(o1.getColor().equals(o2.getColor())) return -1;
                else return 1;
            }
        }).collect(Collectors.toList());
        result1.forEach(System.out::println);

        /////Display colorwise list of fruit names.

        System.out.println("-------only RED color fruits sorted as per their price in ascending order-------");

        List<Fruit> result2 =myFruitlist.stream().filter(s->s.getColor().equals("red")).sorted(new Comparator<Fruit>() {
            @Override
            public int compare(Fruit o1, Fruit o2) {
                if(o1.getPrice()> o2.getPrice()) return 1;
                else return -1;
            }
        }).collect(Collectors.toList());
        result2.forEach(System.out::println);
    }
}
