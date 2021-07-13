import java.util.*;
import java.util.stream.Collectors;

public class Transactionmain {
    public static void main(String[] args) {
        List<Transaction> mytransaction = Arrays.asList(
                new Transaction(new Trader("Rafik","Chennai"),2013,100000),
                new Transaction(new Trader("James","Bangalore"),2011,2500000),
                new Transaction(new Trader("Charlie","Mumbai"),2013,300000),
                new Transaction(new Trader("Joseph","Kerala"),2011,500000),
                new Transaction(new Trader("Lalitha","Delhi"),2018,60000)
        );

        ///////////// Find  all  transactions  in  the  year  2011  and  sort  them  by  value  (small  to high)

        List<Transaction> result = mytransaction.stream()
                .filter(c -> (c.getYear())==2011)
                .sorted(new Comparator<Transaction>() {
                        @Override
                        public int compare(Transaction o1, Transaction o2) {
                            if(o2.getValue() >o1.getValue()) return 1;
                            else return -1; }
                        })
                .collect(Collectors.toList());

        /////////Print all transactions’ values from the traders living in Delhi.

        System.out.println(result);

        List<Transaction> result2 = mytransaction.stream()
                .filter(c->c.getTrader().getCity().equals("Delhi"))
                .collect(Collectors.toList());
        System.out.println("All transactions values from the traders: "+result2);

        ////What’s the highest value of all the transactions

        //OptionalDouble result3 = mytransaction.stream().mapToDouble(v->v.getValue()).max();

        Double result3 = mytransaction.stream().collect(Collectors.groupingBy(value->value.getValue(),Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByKey()).get().getKey();;

        System.out.println("Highest value of the transaction: "+result3);

        ////Find the transaction with the smallest value.

        System.out.print("Transaction with smallest value: ");

        List<Transaction> result4 = mytransaction.stream().
                min(Comparator.comparing(Transaction::getValue))
                .stream()
                .collect(Collectors.toList());
        System.out.println(result4);

    }
}
