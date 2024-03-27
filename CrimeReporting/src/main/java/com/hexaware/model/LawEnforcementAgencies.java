package com.hexaware.model;
/**
 * Represents a law enforcement agency.
 */

public class LawEnforcementAgencies {
	private int AgencyID;// The ID of the agency.
	private String AgencyName;// The name of the agency.
	private String Jurisdiction;// The jurisdiction of the agency.
	private String Address;// The address of the agency.
	private String PhoneNumber;// The phone number of the agency.
	/**
     * Default constructor for the LawEnforcementAgencies class.
     */
	public LawEnforcementAgencies() {
		System.out.println("From LawEnforcementAgencies Constructor");
	}
	/**
     * Parameterized constructor for the LawEnforcementAgencies class.
     * @param AgencyID The ID of the agency.
     * @param AgencyName The name of the agency.
     * @param Jurisdiction The jurisdiction of the agency.
     * @param Address The address of the agency.
     * @param PhoneNumber The phone number of the agency.
     */

	public LawEnforcementAgencies(int AgencyID,String AgencyName,String Jurisdiction,String Address,String PhoneNumber) {
		super();
		this.AgencyID=AgencyID;
		this.AgencyName=AgencyName;
		this.Jurisdiction=Jurisdiction;
		this.Address=Address;
		this.PhoneNumber=PhoneNumber;
	}
	// Getters and setters for the attributes

    // toString method to represent the LawEnforcementAgencies object as a string

	public int getAgencyID() {
		return AgencyID;
	}
	public void setAgencyID(int agencyID) {
		AgencyID = agencyID;
	}
	public String getAgencyName() {
		return AgencyName;
	}
	public void setAgencyName(String agencyName) {
		AgencyName = agencyName;
	}
	public String getJurisdiction() {
		return Jurisdiction;
	}
	public void setJurisdiction(String jurisdiction) {
		Jurisdiction = jurisdiction;
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
		return "LawEnforcementAgencies [AgencyID=" + AgencyID + ", AgencyName=" + AgencyName + ", Jurisdiction="
				+ Jurisdiction + ", Address=" + Address + ", PhoneNumber=" + PhoneNumber + "]";
	}
	

}
