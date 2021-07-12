import java.util.TreeSet;

public class main {
    public static void main(String[] args) {

        person ram = new person("Ram", 153, 65);
        person kumar = new person("Kumar", 155, 55);
        person sasi = new person("Sasi", 145, 55);
        person susa = new person("Susa", 143, 50);
        person aki = new person("Aki", 160, 70);

        TreeSet<person> personCollection = new TreeSet<person>();
        personCollection.add(ram);
        personCollection.add(kumar);
        personCollection.add(sasi);
        personCollection.add(susa);
        personCollection.add(aki);

        for (person i: personCollection){
            System.out.println("Name: "+i.name+", Weight: "+i.weight+", Height: "+ i.height);
        }
    }
}