import java.util.ArrayList;
import java.util.HashSet;
class ChatRoom{

    String name;
    public ChatRoom(String name) {
        this.name = name;
    }
    ArrayList<User> users=new ArrayList<>();    ///hashsetusers
    ArrayList<Message> messages=new ArrayList<Message>();  //Arraylist messages

}