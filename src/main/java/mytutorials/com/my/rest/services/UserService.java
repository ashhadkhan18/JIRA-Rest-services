package mytutorials.com.my.rest.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;

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
	
	public List<Users> getAllUsers(){
		return userlist;
	}
	
	public Users getUserById(String shortid){
		Users usr = null;
		
		for(Users usritr : userlist){
			if(usritr.getShortId().equalsIgnoreCase(shortid)){
				usr = usritr;
			}
		}
		return usr;
	}
	
	public Users createUser(Users usr){
		StringBuilder sb = new StringBuilder();
		sb.append(usr.getFirstName().charAt(0));
		if(usr.getLastName().length()>4)
		sb.append(usr.getLastName().substring(0, 6));
		usr.setShortId(sb.toString());
		userlist.add(usr);
		return usr;
	}
	
	public Users udpateUser(String shortid,Users updateduser){
		
		ListIterator<Users> ltr = userlist.listIterator();
		while(ltr.hasNext()){
			Users usr =ltr.next();
			if(usr.getShortId().equalsIgnoreCase(shortid)){
				updateduser.setShortId(shortid);
				ltr.set(updateduser);
				break;
				
			}
		}
		return updateduser;
	}
	
	public void deleteUser(String shortid){
		ListIterator<Users> ltr = userlist.listIterator();
		while(ltr.hasNext()){
			Users usr =ltr.next();
			if(usr.getShortId().equalsIgnoreCase(shortid)){
				
				ltr.remove();
				
			}
		}
	}
}
