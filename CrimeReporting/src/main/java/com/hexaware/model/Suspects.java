package com.hexaware.model;

import java.time.LocalDate;

public class Suspects {
	private int SuspectID;// The ID of the suspect.
	private String FirstName;// The first name of the suspect.
	private String LastName;// The last name of the suspect.
	private LocalDate DateOfBirth;// The date of birth of the suspect.
	private String Gender;// The gender of the suspect. (e.g., Male, Female)
	private String Address;// The address of the suspect.
	private String PhoneNumber;// The phone number of the suspect.
	/**
     * Default constructor for the Suspects class.
     */
	
	public Suspects() {
		System.out.println("From Suspect Constructor...");
	}
	 /**
     * Parameterized constructor for the Suspects class.
     * @param SuspectID The ID of the suspect.
     * @param FirstName The first name of the suspect.
     * @param LastName The last name of the suspect.
     * @param DateOfBirth The date of birth of the suspect.
     * @param Gender The gender of the suspect.
     * @param Address The address of the suspect.
     * @param PhoneNumber The phone number of the suspect.
     */
	public Suspects(int SuspectID,String FirstName,String LastName,LocalDate DateOfBirth,String Gender,String Address,String PhoneNumber ) {
		super();
		this.SuspectID=SuspectID;
		this.FirstName=FirstName;
		this.LastName=LastName;
		this.DateOfBirth=DateOfBirth;
		this.Gender=Gender;
		this.Address=Address;
		this.PhoneNumber=PhoneNumber;
	}
// Getters and setters for the attributes
    
    // toString method to represent the Suspects object as a string

	public int getSuspectID() {
		return SuspectID;
	}
	public void setSuspectID(int suspectID) {
		SuspectID = suspectID;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public LocalDate getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Suspects [SuspectID=" + SuspectID + ", FirstName=" + FirstName + ", LastName=" + LastName
				+ ", DateOfBirth=" + DateOfBirth + ", Gender=" + Gender + ", Address=" + Address + ", PhoneNumber="
				+ PhoneNumber + "]";
	}
	

}
