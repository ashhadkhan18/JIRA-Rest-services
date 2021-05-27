package mytutorials.com.my.rest.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import mytutorials.com.my.rest.services.models.Comments;

public class CommentService {
	
	private static List<Comments> commentList = new ArrayList<>();
	static{
		commentList.add(new Comments(1l,"aflintof","my test comment 1",new Date()));
		commentList.add(new Comments(2l,"sbroad","my test comment 1",new Date()));
		commentList.add(new Comments(3l,"aflintof","my test comment 2",new Date()));
		commentList.add(new Comments(4l,"vkohli","my test comment 1",new Date()));
		commentList.add(new Comments(5l,"sbroad","my test comment 2",new Date()));
	}
	
	public List<Comments> getinitialComments(){
		return commentList;
	}
    
  
}
