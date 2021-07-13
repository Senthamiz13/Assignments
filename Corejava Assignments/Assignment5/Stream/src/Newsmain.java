import java.util.*;
import java.util.stream.Collectors;

public class Newsmain {
    public static void main(String[] args) {

        List<News> mynewslist = Arrays.asList(
                new News(123,"Ram","Sasi","good budget news"),
                new News(546,"Sasi","karna","bad budget news"),
                new News(123,"Aki","karna","good  news"),
                new News(789,"Lal","Ram","bad budget news"),
                new News(123,"Pradeep","vinoth","good  news")
        );

        Integer result = mynewslist
                .stream()
                //creating a stream of news
                .collect(Collectors.groupingBy(News::getNewsId,Collectors.counting()))
                //repackaging elements by news ID as key  and counting as value)
                .entrySet()
                //making a map to set
                .stream()
                /// creating a stream
                .max(Map.Entry.comparingByValue())
                //getting maximum value map.stream
                .get().getKey(); // geting the key of the maximum value

        ///////reference https://www.baeldung.com/java-8-collectors///

        System.out.println("News id with maximum comments : "+result);

        //System.out.println("------------------------");

        ///////the word 'budget' arrived in user comments all news./////
        long result1 = mynewslist.stream().filter(s->s.getComment().contains("budget")).count();
        System.out.println("the word 'budget' arrived in user comments all news:"+result1);

        ////which user has posted maximum comments./////
        String result2 = mynewslist.stream()
                .collect(Collectors.groupingBy(News::getCommenByUser,Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get().getKey();
        System.out.println("User has posted maximum comments: "+result2);

        Map result3= mynewslist.stream().collect(Collectors.groupingBy(News::getCommenByUser,Collectors.counting()));
        System.out.println(result3);


    }
}
