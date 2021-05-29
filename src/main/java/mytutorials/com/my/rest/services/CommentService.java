package mytutorials.com.my.rest.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;

import mytutorials.com.my.rest.services.models.Comments;

public class CommentService {
	
	private static List<Comments> commentList = new ArrayList<>();
	static{
		commentList.add(new Comments(1l,"aflintof","my test comment 1",new Date(),100l));
		commentList.add(new Comments(2l,"sbroad","my test comment 1",new Date(),100l));
		commentList.add(new Comments(3l,"aflintof","my test comment 2",new Date(),100l));
		commentList.add(new Comments(4l,"vkohli","my test comment 1",new Date(),101l));
		commentList.add(new Comments(5l,"sbroad","my test comment 2",new Date(),101l));
	}
	
	public Comments getCommentbyid(long ticketId,long commentid){
		Comments comment = null;
		for(Comments cmnt:commentList){
			if(cmnt.getTicketid()==ticketId&&cmnt.getId()==commentid){
				comment = cmnt;
			}
		}
		
		return comment;
	}
	
	public List<Comments> getallCommentsbyticketid(long ticketid){
		List<Comments> commentresultList = new ArrayList<>();
		for(Comments cmnt:commentList){
			if(cmnt.getTicketid()==ticketid){
				commentresultList.add(cmnt);
			}
		}
		return commentresultList;
	}
    
	public Comments createComment(Comments newComment,long ticketId){
		Comments comment = newComment;
		comment.setCreatedDate(new Date());
		comment.setId(commentList.size()+1);
		comment.setTicketid(ticketId);
		
		commentList.add(comment);
		
		return comment;
	}
	
	public Comments modifyComments(Comments modifiedComment,long ticketId,long commentId){
		
		ListIterator<Comments> ltr = commentList.listIterator();
		Comments comment = modifiedComment;
		comment.setCreatedDate(new Date());
		comment.setTicketid(ticketId);
		comment.setId(commentId);
		
		while(ltr.hasNext()){
			if(ltr.next().getId()==commentId){
				ltr.set(comment);
			}
		}
				
		return comment;
	}
	
public void deleteComments(long commentId){
		
		ListIterator<Comments> ltr = commentList.listIterator();
	
		while(ltr.hasNext()){
			if(ltr.next().getId()==commentId){
				ltr.remove();
			}
		}
				
	}
}
