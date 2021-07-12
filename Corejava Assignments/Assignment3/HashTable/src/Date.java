import java.util.Objects;

public class Date {
     int date;
     int month;
     int year;

    public Date(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Date{" +
                "date=" + date +
                ", month=" + month +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())  return false;
        System.out.println("fails");
        Date date1 = (Date) o;
        return date == date1.date && month == date1.month;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, month);
    }



}
