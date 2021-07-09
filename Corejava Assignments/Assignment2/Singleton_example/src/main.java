public class main extends Singleton{

    public static void main(String[] args) {
        Singleton newsingletonobject = Singleton.getInstance();
        Singleton secondsingletonobject = Singleton.getInstance();

        System.out.println(newsingletonobject);
        System.out.println(secondsingletonobject);
    }
}
