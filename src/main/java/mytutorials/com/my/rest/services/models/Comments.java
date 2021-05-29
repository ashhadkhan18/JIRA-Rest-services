package mytutorials.com.my.rest.services.models;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement

public class Comments {

	
	long id;
	String commentor;
	String commentDesc;
	Date createdDate;
	long ticketid;
	
	
	public long getTicketid() {
		return ticketid;
	}
	public void setTicketid(long ticketid) {
		this.ticketid = ticketid;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCommentor() {
		return commentor;
	}
	public void setCommentor(String commentor) {
		this.commentor = commentor;
	}
	public String getCommentDesc() {
		return commentDesc;
	}
	public void setCommentDesc(String commentDesc) {
		this.commentDesc = commentDesc;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Comments(long id, String commentor, String commentDesc, Date createdDate, long ticketid) {
		super();
		this.id = id;
		this.commentor = commentor;
		this.commentDesc = commentDesc;
		this.createdDate = createdDate;
		this.ticketid = ticketid;
	}
	
	public Comments() {
		
	}
}
