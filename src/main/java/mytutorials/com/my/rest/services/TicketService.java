package mytutorials.com.my.rest.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import mytutorials.com.my.rest.services.models.Comments;
import mytutorials.com.my.rest.services.models.Tickets;

public class TicketService {

	private static List<Tickets> ticketList = new ArrayList<>();
	static{
		ticketList.add(new Tickets(100l,"First test ticket",new Date(),"","","aflintof",new ArrayList<Comments>(),Tickets.Status.Open,Tickets.Priority.Major));
		ticketList.add(new Tickets(101l,"second test ticket",new Date(),"","","sbroad",new ArrayList<Comments>(),Tickets.Status.Open,Tickets.Priority.Blocker));
		ticketList.add(new Tickets(102l,"third test ticket",new Date(),"","","vkohli",new ArrayList<Comments>(),Tickets.Status.Open,Tickets.Priority.High));
	}
	
	
	public List<Tickets> getallTickets(){
		return ticketList;
	}
	
	public Tickets createTicket(Tickets newticket){
		newticket.setId(ticketList.size()+100);
		newticket.setCreateDate(new Date());
		ticketList.add(newticket);
		return newticket;
		
	}
	
	public Tickets getticketbyID(long id){
		Tickets result = null;
		for(Tickets tckts: ticketList){
			if(tckts.getId()==id){
				result = tckts;
			}
		}
		
		if(result==null){
			//throw exception 404
		}
		return result;
	}
	
	public List<Tickets> getTicketsByCreatedUserId(String createdById){
		List<Tickets> resultlist = new ArrayList<>();
		for(Tickets tckts: ticketList){
			if(tckts.getCreatedBy().equalsIgnoreCase(createdById)){
				resultlist.add(tckts);
			}
		}
		
		return resultlist;
	}
	
	public List<Tickets> getassignedTickets(String assingedToId){
		List<Tickets> resultlist = new ArrayList<>();
		for(Tickets tckts: ticketList){
			if(tckts.getAssignedTo().equalsIgnoreCase(assingedToId)){
				resultlist.add(tckts);
			}
		}
		
		return resultlist;
	}
	
	
	public void deleteTicket(long id){
		for(Tickets tckts: ticketList){
			if(tckts.getId()==id){
				ticketList.remove(tckts);
				return;
			}
		}
	}
	
	public Tickets updateTicket(Tickets ticket,long id){
		Tickets updatedticket = null;
		updatedticket = ticket;
		updatedticket.setId(id);
		ticketList.set((int)(id-100), updatedticket);
		
		return updatedticket;
	}
}
