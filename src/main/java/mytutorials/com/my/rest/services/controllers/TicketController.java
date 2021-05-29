package mytutorials.com.my.rest.services.controllers;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import mytutorials.com.my.rest.services.TicketService;
import mytutorials.com.my.rest.services.models.Tickets;

@Path("/tickets")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)

public class TicketController {

	private TicketService ts = new TicketService();
	
	
	
	@GET
	public Response getAllTickets(){
		List<Tickets> ticketList = ts.getallTickets() ;
		
		return Response.status(Status.OK)
						.entity(ticketList)
						.build();
	}
	
	@GET
	@Path("/{ticketid}")
	public Response getTicketById(@PathParam("ticketid") long id){
		Tickets ticket = ts.getticketbyID(id) ;
		
		return Response.status(Status.OK)
						.entity(ticket)
						.build();
	}
	
	
	@Path("{userid}/created")
	@GET
	public Response getTicketBycreatedId(@PathParam("userid") String createdId){
		List<Tickets> ticketList = ts.getTicketsByCreatedUserId(createdId);
		
		
		return Response.status(Status.OK)
						.entity(ticketList)
						.build();
	}
	
	@Path("{userid}/assigned")
	@GET
	public Response getTicketByassignedId(@PathParam("userid") String assignedId){
		List<Tickets> ticketList = ts.getassignedTickets(assignedId);
		
		
		return Response.status(Status.OK)
						.entity(ticketList)
						.build();
	}
	
	@POST
	public Response createATicket(Tickets ticket){
		ts.createTicket(ticket);
		return Response.status(Status.CREATED)
				       .entity(ticket)
				       .build();
	}	
	
	@DELETE
	@Path("/{id}")
	public Response deleteTicket(@PathParam("id") long id){
		ts.deleteTicket(id);
		return Response.status(Status.NO_CONTENT).build();
	}
	
	@Path("/{id}")
	@PUT
	public Response updateTicket(@PathParam("id") long id,Tickets ticket){
		Tickets updatedTicket = ts.updateTicket(ticket, id);
		return Response.status(Status.OK)
						.entity(updatedTicket)
						.build();
	}
	
	@Path("/{ticketid}/comments")
	public CommentController getCommentByTicketId(){
		return new CommentController();
	}
}
