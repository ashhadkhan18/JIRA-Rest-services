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

import mytutorials.com.my.rest.services.UserService;
import mytutorials.com.my.rest.services.models.Users;


@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)


public class UserController {

	
	private UserService us = new UserService();
	
	
	
	@GET
	public Response getAllUsers(){
		List<Users> userList = us.getAllUsers() ;
		
		return Response.status(Status.OK)
						.entity(userList)
						.build();
	}
	
	
	
	@Path("/{userid}")
	@GET
	public Response getUserById(@PathParam ("userid") String id){
		Users user = us.getUserById(id);
		
		return Response.status(Status.OK)
				.entity(user)
				.build();
	}
	
	
	@POST
	public Response createUser(Users usr){
		Users user = us.createUser(usr);
		return Response.status(Status.CREATED)
				.entity(user)
				.build();
	}
	
	@PUT 
	@Path("/{shortID}")
	public Response updateUser(Users usr, @PathParam ("shortID") String shortid){
		
		Users user = us.udpateUser(shortid, usr);
		
		return Response.status(Status.OK)
				.entity(user)
				.build();
	}
	
	@Path("/{shortID}")
	@DELETE
	public Response deleteUsers(@PathParam ("shortID") String shortid){
		us.deleteUser(shortid);
		return Response.status(Status.NO_CONTENT)
						.build();
	}
	

}
