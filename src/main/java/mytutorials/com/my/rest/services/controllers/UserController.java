package mytutorials.com.my.rest.services.controllers;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import mytutorials.com.my.rest.services.UserService;
import mytutorials.com.my.rest.services.models.Users;


@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)


public class UserController {

	
	private UserService us = new UserService();
	
	
	
	@GET
	public Response getAllUsers(){
		List<Users> userList = us.getInitialUsers() ;
		
		return Response.status(Status.OK)
						.entity(userList)
						.build();
	}
	
	
	
	@Path("/{userid}")
	@GET
	public Response getUserById(@PathParam ("userid") long id){
		Users user = null;
		
		return Response.status(Status.OK)
				.entity(user)
				.build();
	}
	
	
	
	
/*	@Path("/{userid}/usertickets")
	@GET
	public TicketController getticketsrelatedtoUser(){
		return new TicketController();
	}*/
}
