package mytutorials.com.my.rest.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import mytutorials.com.my.rest.services.models.Tickets;
import mytutorials.com.my.rest.services.models.Users;

public class UserService {
	
	private static List<Users> userlist = new ArrayList<>();
	private static TicketService ts = new TicketService();
	
	static{
		userlist.add(new Users("aflintof","Andrew","Flintoff",new Date(),"aflintof@testmail.com",new ArrayList<Tickets>(),new ArrayList<Tickets>()));
		userlist.add(new Users("sbroad","Stuart","Broad",new Date(),"sbroad@testmail.com",new ArrayList<Tickets>(),new ArrayList<Tickets>()));
		userlist.add(new Users("vkohli","Virat","Kohli",new Date(),"vkohli@testmail.com",new ArrayList<Tickets>(),new ArrayList<Tickets>()));
	}
	
	public List<Users> getInitialUsers(){
		return userlist;
	}

}
