public class main {
    public static void main(String[] args) {

        Arithmetic obj = (a,b)-> a+b;
        System.out.println(obj.arith(5,6));
        Arithmetic obj1 = (a,b) -> a-b;
        System.out.println(obj1.arith(4,3));
        Arithmetic obj2 = (a,b)-> a*b;
        System.out.println(obj2.arith(5,2));
        Arithmetic obj3 = (a,b) -> a/b;
        System.out.println(obj3.arith(5,6));
    }
}
