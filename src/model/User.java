package model;

import java.io.Serializable;

public class User implements Serializable {

	
	private static final long serialVersionUID = 42L;

	long id;
	String firstName;
	String lastName;
	String mail;
	String address;
	String pwd;
	String gender;
	String smoker;
	String phone;
	int nbPlace;
	int mobilityDriver;
	String acceptSmokerDriver;
	int mobilityPassenger;
	String acceptSmokerPassenger;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSmoker() {
		return smoker;
	}
	public void setSmoker(String smoker) {
		this.smoker = smoker;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getNbPlace() {
		return nbPlace;
	}
	public void setNbPlace(int nbPlace) {
		this.nbPlace = nbPlace;
	}
	public int getMobilityDriver() {
		return mobilityDriver;
	}
	public void setMobilityDriver(int mobilityDriver) {
		this.mobilityDriver = mobilityDriver;
	}
	public String getAcceptSmokerDriver() {
		return acceptSmokerDriver;
	}
	public void setAcceptSmokerDriver(String acceptSmokerDriver) {
		this.acceptSmokerDriver = acceptSmokerDriver;
	}
	public int getMobilityPassenger() {
		return mobilityPassenger;
	}
	public void setMobilityPassenger(int mobilityPassenger) {
		this.mobilityPassenger = mobilityPassenger;
	}
	public String getAcceptSmokerPassenger() {
		return acceptSmokerPassenger;
	}
	public void setAcceptSmokerPassenger(String acceptSmokerPassenger) {
		this.acceptSmokerPassenger = acceptSmokerPassenger;
	}

	
	

}


