package model;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = 42L;

	private static long countid = 0;

	private long id;
	private String firstName, lastName, mail, pwd;
	private String gender, smoker, phone;
	private int nbPlace, mobilityDriver, mobilityPassenger;
	private String acceptSmokerDriver, acceptSmokerPassenger;
	private String address_rue;
	private String address_nbrue;
	private String address_ville;

	public long getId() {
		return id;
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

	public String getAddress_rue() {
		return address_rue;
	}

	public void setAddress_rue(String address_rue) {
		this.address_rue = address_rue;
	}

	public String getAddress_nbrue() {
		return address_nbrue;
	}

	public void setAddress_nbrue(String address_nbrue) {
		this.address_nbrue = address_nbrue;
	}

	public String getAddress_ville() {
		return address_ville;
	}

	public void setAddress_ville(String address_ville) {
		this.address_ville = address_ville;
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

	public User(String firstName, String lastName, String address_ville, String address_rue, String address_nbrue,
			String mail, String pwd) {
		super();

		this.id = ++countid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address_ville = address_ville;
		this.address_rue = address_rue;
		this.address_nbrue = address_nbrue;
		this.mail = mail;
		this.pwd = pwd;
		this.gender = null;
		this.smoker = null;
		this.nbPlace = 0;
		this.mobilityDriver = 0;
		this.acceptSmokerDriver = null;
		this.mobilityPassenger = 0;
		this.acceptSmokerPassenger = null;
	}

}
