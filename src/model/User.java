package model;

import java.io.Serializable;

public class User implements Serializable {

	
	private static final long serialVersionUID = 42L;
	
	private static long countid=0;
	
	private long id;
	private String firstName, lastName, address, mail, pwd;
	private String gender, smoker, phone;
	private int nbPlace, mobilityDriver, mobilityPassenger;
	private String acceptSmokerDriver,  acceptSmokerPassenger;
	
	public long getId() {return id;}
	
	public String getFirstName() {return firstName;}
	public void setFirstName(String firstName) {this.firstName = firstName;}
	
	public String getLastName() {return lastName;}
	public void setLastName(String lastName) {this.lastName = lastName;}
	
	public String getMail() {return mail;}
	public void setMail(String mail) {this.mail = mail;}
	
	public String getAddress() {return address;}
	public void setAddress(String address) {this.address = address;}
	
	public String getPwd() {return pwd;}
	public void setPwd(String pwd) {this.pwd = pwd;}
	
	public String getGender() {return gender;}
	public void setGender(String gender) {this.gender = gender;}
	
	public String getSmoker() {return smoker;}
	public void setSmoker(String smoker) {this.smoker = smoker;}
	
	public String getPhone() {return phone;}
	public void setPhone(String phone) {this.phone = phone;}
	
	public int getNbPlace() {return nbPlace;}
	public void setNbPlace(int nbPlace) {this.nbPlace = nbPlace;}
	
	public int getMobilityDriver() {return mobilityDriver;}
	public void setMobilityDriver(int mobilityDriver) {this.mobilityDriver = mobilityDriver;}
	
	public String getAcceptSmokerDriver() {return acceptSmokerDriver;}
	public void setAcceptSmokerDriver(String acceptSmokerDriver) {this.acceptSmokerDriver = acceptSmokerDriver;}
	
	public int getMobilityPassenger() {return mobilityPassenger;}
	public void setMobilityPassenger(int mobilityPassenger) {this.mobilityPassenger = mobilityPassenger;}
	
	public String getAcceptSmokerPassenger() {return acceptSmokerPassenger;}
	public void setAcceptSmokerPassenger(String acceptSmokerPassenger) {this.acceptSmokerPassenger = acceptSmokerPassenger;}
	
	public User(String firstName, String lastName, String address, String mail, String pwd) {
		super();
		this.id = ++countid; this.firstName = firstName; this.lastName = lastName;
		this.address = address; this.mail = mail; this.pwd = pwd;
		this.gender = null; this.smoker = null; this.nbPlace = 0;
		this.mobilityDriver = 0; this.acceptSmokerDriver=null;
		this.mobilityPassenger = 0;	this.acceptSmokerPassenger = null;
	}

}


