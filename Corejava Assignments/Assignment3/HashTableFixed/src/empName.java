import java.util.Objects;

public class empName {
    String name;
    public empName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "empName{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
     return true;
    }

    @Override
    public int hashCode() {
        return 15;
    }
}
