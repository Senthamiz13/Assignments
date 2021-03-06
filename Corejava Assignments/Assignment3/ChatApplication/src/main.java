import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class main {

    public static void main(String args[]){
        String end;
        String logout;

        CopyOnWriteArrayList<ChatRoom> chatRoomList = new CopyOnWriteArrayList<>();  //// chatrooms
        CopyOnWriteArrayList<User> usersList=new CopyOnWriteArrayList<>();//
        ArrayList<Message> messagesList=new ArrayList<Message>();

        do{
            System.out.println("> Java Chat Application ");
            System.out.println("options:");
            System.out.println("A.Create a Chatroom");
            System.out.println("B.Add a User");
            System.out.println("C.User Login");

            System.out.print("ENTER your choice: ");  ////entering your choice
            Scanner input =new Scanner(System.in);  /// scanner for choice
            String choice = input.nextLine();

            switch(choice)
            {
                case "A":

                    ///////////// Creating Chat room /////////////
                    boolean chatroomNameCheckerFlag=false;
                    System.out.print("Name of the Chat Room: ");
                    String newChatRoomName = input.next(); // storing new chat room name

                    for(ChatRoom x:chatRoomList){
                        if(x.name.equals(newChatRoomName)==true) {
                            System.out.println("Chatroom already exits");
                            chatroomNameCheckerFlag=true;
                        }
                    }
                    if(chatroomNameCheckerFlag==false){
                        ChatRoom c = new ChatRoom(newChatRoomName); //new ChatRoom object
                        chatRoomList.add(c); //adding new chatrooms
                    }
                    break;

                case "B":

                    ////////////adding a user//////////////
                    System.out.print("Enter the user name: ");
                    Scanner input2 =new Scanner(System.in);
                    String username = input2.next();
                    usersList.add(new User(username)); //adding new user to user
                    break;

                case "C":

                    System.out.print("Chatroom name: ");
                    String existingChatRoom=input.next();
                    boolean existingChatRoomChecker=false;
                    boolean existingUserNameChecker=false;

                    for(ChatRoom x:chatRoomList){
                        if(x.name.equals(existingChatRoom)) {
                            existingChatRoomChecker=true;
                            for(User u:usersList){
                                System.out.println(u.uname);  //print all names in user
                            }
                            System.out.print("Enter user name: ");
                            String username2 = input.next();

                            for(User y:usersList){
                                if(username2.equals(y.uname)){
                                    existingUserNameChecker=true;
                                    do{
                                        System.out.println("Welcome "+y.uname);
                                        System.out.println("D. Send a Message");
                                        System.out.println("E. See all Messages");
                                        System.out.println("F. See all Users");
                                        System.out.println("G. Logout ");
                                        System.out.println("H. Delete a User");
                                        System.out.println("I. Delete a Chatroom");
                                        Scanner input1 =new Scanner(System.in);
                                        String userChoice = input1.nextLine();
                                        switch(userChoice)
                                        {
                                            case "D":
                                                Scanner sc2= new Scanner(System.in);
                                                System.out.println("Enter the message: ");
                                                String msg=sc2.nextLine();
                                                Message umsg=new Message(msg,y.uname);
                                                messagesList.add(umsg);
                                                System.out.println("message sent");
                                                break;
                                            case "E":
                                                System.out.println("Messages in Chatroom"+x.name);
                                                for(Message m:messagesList){
                                                    System.out.println(m.mname+"> "+m.data);
                                                }
                                                break;
                                            case "F":
                                                System.out.println("Users in chatroom "+x.name);
                                                for(User u:usersList){
                                                    System.out.println(u.uname);
                                                }
                                                break;
                                            case "G":
                                                System.out.println("Logging out");
                                                break;
                                            case "H":
                                                System.out.print("Enter the userName to delete: ");
                                                Scanner input3 =new Scanner(System.in);
                                                String deluser = input3.nextLine();
                                                for (User s:usersList){
                                                    if (s.uname.equals(deluser)) {usersList.remove(s);}
                                                }
                                                System.out.println("User "+deluser+" Deleted");
                                                break;
                                            case "I":
                                                System.out.print("Enter the chatroom to delete: ");
                                                Scanner input4 = new Scanner(System.in);
                                                String delcr = input4.nextLine();
                                                for (ChatRoom m: chatRoomList){
                                                    if (m.name.equals(delcr)){chatRoomList.remove(m);}
                                                }
                                                System.out.println("Chatroom "+delcr+" Deleted");
                                                break;

                                            default:
                                                System.out.println("WRONG CHOICE");
                                                break;
                                        }
                                        System.out.print("Enter Y to Continue any key to logout: ");
                                        Scanner input3 =new Scanner(System.in);
                                        logout = input3.nextLine();
                                    }while(logout.equals("Y"));

                                }
                            }
                            if(existingUserNameChecker==false){ System.out.println("User Does Not Exists"); }
                        }
                    }
                    if(existingChatRoomChecker==false){ System.out.println("Chatroom does not exists"); }
                default: System.out.println("WRONG CHOICE");
            }
            end:
            System.out.print("Enter Y to continue any key to end application: ");
            Scanner input4 =new Scanner(System.in);
            end = input4.nextLine();
        } while(end.equals("Y"));

    }
}
}
