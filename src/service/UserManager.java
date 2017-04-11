package service;
import java.util.List;
import java.util.ArrayList;

import model.User;

public class UserManager {
	private static UserManager singleton;
	
	private List<User> allUser;
	
	public static UserManager getUserManager(){
		if(singleton==null){
			singleton=new UserManager();
		}
		return singleton;
	}
	
	public UserManager() {
		super();
		this.allUser = new ArrayList<User>();
	}
	
	public void addUser(User u){
		allUser.add(u);
	}
	
	public void deleteUser(User u){
		allUser.remove(u);
	}
	
	public List<User> getAllUser(){
		return allUser;
	}

}
