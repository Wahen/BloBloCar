package service;

public class FieldValidation {

	public static String validateEmail(String email) {
		if (email != null && email.trim().length() != 0) {
			if (!email.matches("([^.@]+)(\\.[^.@]+)*@([^.@]+\\.)+([^.@]+)"))
				return "Veuillez saisir une adresse mail valide";
		} else {
			return "L'adresse mail est obligatoire";
		}
		return null;
	}
	
	
	public static String validatePwd(String pwd, String pwdConfirm) {
		return (pwd.equals(pwdConfirm)) ? null : "mdp different";
	}

	
	public static String validateFirstName(String firstName) {
		if (firstName.length() < 3)
			return "Votre prénom doit comporter au moins trois caractères";
		return null;
	}
	
	public static String validateLastName(String lastName) {
		if (lastName.length() < 3)
			return "Votre nom doit comporter au moins trois caractères";
		return null;
	}
	
	
}
