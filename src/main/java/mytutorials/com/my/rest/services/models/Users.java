package mytutorials.com.my.rest.services.models;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement

public class Users {
	
String shortId;
String firstName;
String lastName;
Date createdDate;
String email;
List<Tickets> createdTickets;
List<Tickets> assignedTickets;
public String getShortId() {
	return shortId;
}
public void setShortId(String shortId) {
	this.shortId = shortId;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public Date getCreatedDate() {
	return createdDate;
}
public void setCreatedDate(Date createdDate) {
	this.createdDate = createdDate;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public List<Tickets> getCreatedTickets() {
	return createdTickets;
}
public void setCreatedTickets(List<Tickets> createdTickets) {
	this.createdTickets = createdTickets;
}
public List<Tickets> getAssignedTickets() {
	return assignedTickets;
}
public void setAssignedTickets(List<Tickets> assignedTickets) {
	this.assignedTickets = assignedTickets;
}
public Users(String shortId, String firstName, String lastName, Date createdDate, String email,
		List<Tickets> createdTickets, List<Tickets> assignedTickets) {
	super();
	this.shortId = shortId;
	this.firstName = firstName;
	this.lastName = lastName;
	this.createdDate = createdDate;
	this.email = email;
	this.createdTickets = createdTickets;
	this.assignedTickets = assignedTickets;
}

public Users() {
	super();

}

}
