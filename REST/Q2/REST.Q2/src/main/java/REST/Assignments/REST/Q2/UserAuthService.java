package REST.Assignments.REST.Q2;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;


@Service
public class UserAuthService {
	
	private List<User> UserList = Arrays.asList(
			new User("Maddy","mad125"),
			new User("Sen","senb557")
			);
	
	public String check(User u1) {
		for (User u : UserList)
			{
		  if(u.getUsername().matches(u1.getUsername())){
			  if(u.getPassword().matches(u1.getPassword())) 
					return  "Valid User"; 
		  }
			}
		return "Invalid User";
	}
	
	public List<User>  allusers() {
		return UserList;
	}
	
	
}
