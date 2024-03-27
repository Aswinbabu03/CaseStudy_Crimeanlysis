package com.hexaware.model;

import java.time.LocalDate;

public class Victims {
	/**
	 * The ID of the victim.
	 */
	private int VictimID;
	/**
	 * The first name of the victim.
	 */
	private String FirstName;
	/**
	 * The last name of the victim.
	 */
	private String LastName;
	/**
	 * The date of birth of the victim.
	 */
	private LocalDate DateOfBirth;
	/**
	 * The gender of the victim.
	 * Can be "Male", "Female", or "Other".
	 */
	private String Gender;
	/**
	 * The address of the victim.
	 */
	private String Address;
	/**
	 * The phone number of the victim.
	 */

	private String PhoneNumber;
	
	public Victims() {
		System.out.println("From Victim Constructor...");
	}
	/**
     * Parameterized constructor for the Victims class.
     * @param VictimID The ID of the victim.
     * @param FirstName The first name of the victim.
     * @param LastName The last name of the victim.
     * @param DateOfBirth The date of birth of the victim.
     * @param Gender The gender of the victim.
     * @param Address The address of the victim.
     * @param PhoneNumber The phone number of the victim.
     */
	
	public Victims(int VictimID,String FirstName,String LastName,LocalDate DateOfBirth,String Gender,String Address,String PhoneNumber ) {
		super();
		this.VictimID=VictimID;
		this.FirstName=FirstName;
		this.LastName=LastName;
		this.DateOfBirth=DateOfBirth;
		this.Gender=Gender;
		this.Address=Address;
		this.PhoneNumber=PhoneNumber;
	}
	 // Getters and setters

    // toString method
	public int getVictimID() {
		return VictimID;
	}
	public void setVictimID(int victimID) {
		VictimID = victimID;
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
		return "Victims [VictimID=" + VictimID + ", FirstName=" + FirstName + ", LastName=" + LastName
				+ ", DateOfBirth=" + DateOfBirth + ", Gender=" + Gender + ", Address=" + Address + ", PhoneNumber="
				+ PhoneNumber + "]";
	}
	
	
	

}
