public class Singleton {

    //constructor is made private so access to constructor is limited to this class
    private Singleton() {
    }

    static Singleton default_instance = null;    ///  default instance non

    public static Singleton getInstance(){
        if(default_instance == null)
        {
            default_instance = new Singleton();   //creating a new Singleton instance
        }
        return default_instance;
    }
}