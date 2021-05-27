package mytutorials.com.my.rest.services.models;

import java.util.Date;
import java.util.List;

public class Tickets {

	private long id;
	private String description;
	private Date createDate;
	private String assignedBy;
	private String assignedTo;
	private String createdBy;
	private Status ticketStatus;
	private List<Comments> comments;
	private Priority ticketPriority;
	
	public static enum Status {Open,InProgress,Resolved,Fixed,Reopen,PendingForInputs}
	public static enum Priority {Blocker,High,Critical,Major,Minor,low}
	
	
	public Status getTicketStatus() {
		return ticketStatus;
	}
	public void setTicketStatus(Status ticketStatus) {
		this.ticketStatus = ticketStatus;
	}
	public Priority getTicketPriority() {
		return ticketPriority;
	}
	public void setTicketPriority(Priority ticketPriority) {
		this.ticketPriority = ticketPriority;
	}
	public List<Comments> getComments() {
		return comments;
	}
	public void setComments(List<Comments> comments) {
		this.comments = comments;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getAssignedBy() {
		return assignedBy;
	}
	public void setAssignedBy(String assignedBy) {
		this.assignedBy = assignedBy;
	}
	public String getAssignedTo() {
		return assignedTo;
	}
	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Tickets(long id, String description, Date createDate, String assignedBy, String assignedTo,
			String createdBy,List<Comments> comments,Status status, Priority priority) {
		super();
		this.id = id;
		this.description = description;
		this.createDate = createDate;
		this.assignedBy = assignedBy;
		this.assignedTo = assignedTo;
		this.createdBy = createdBy;
		this.comments = comments;
		this.ticketStatus = status;
		this.ticketPriority = priority;
	}
	public Tickets() {
		super();
	};
	
	
}
