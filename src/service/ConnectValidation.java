package service;

import java.util.List;

import model.User;

public class ConnectValidation {
	
	public static String authenticate(String mail, String pwd) {
		
		List<User> liste = UserManager.getUserManager().getAllUser();
		
		for (User user : liste) {
			if(user.getMail().equals(mail)) {
				if(user.getPwd().equals(pwd)) {
					return null;
				}
				else {return "wrong pwd";}
			}	
		}
		return "email not found";
	}
	public static String pwdValidation(String pwd) {
		if(pwd!= null && pwd !="") {
			return null;
		}
		else {return "Le mot de passe est obligatoire";}
	}
}
