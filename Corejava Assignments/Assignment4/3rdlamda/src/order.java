public class order {
    String status;
    int price;
    String name;
    public order(String status, int price, String name) {

        this.status = status;
        this.price = price;
        this.name = name;
    }

    @Override
    public String toString() {
        return "order{" +
                "status='" + status + '\'' +
                ", price=" + price +
                '}';
    }
}
