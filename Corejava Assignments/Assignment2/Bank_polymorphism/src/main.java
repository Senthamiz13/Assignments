public class main {
    public static void main(String[] args) {

        savings lilly = new savings(4278, "lilly", 4000, "savings");
        current manik = new current(5265, "manik", 1000, "current");

        System.out.println("Total amount as a Fixed deposit in savings is " +lilly.fdTotal);
        System.out.println("Total amount as a cash credit in current is " +manik.cctotal);

        System.out.println("Total Amount in Bank:"+(lilly.fdTotal+manik.cctotal) );
    }
}