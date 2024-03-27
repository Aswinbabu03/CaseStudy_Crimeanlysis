package com.hexaware.model;
/**
 * Represents a law enforcement officer.
 */

public class Officers {
	private int OfficerID;// The ID of the officer.
	private String FirstName;// The first name of the officer.
	private String LastName;// The last name of the officer.
	private int BadgeNumber; // The badge number of the officer.
	private int RankNumber;// The rank number of the officer.
	private String Address;// The address of the officer.
	private String PhoneNumber; // The phone number of the officer.
	private int AgencyID; // The ID of the law enforcement agency the officer belongs to.
	//private int LawEnforcementAgencies;
	/**
     * Default constructor for the Officers class.
     */
	public Officers() {
		System.out.println("From Officers Constructor...");
	}
	 /**
     * Parameterized constructor for the Officers class.
     * @param OfficerID The ID of the officer.
     * @param FirstName The first name of the officer.
     * @param LastName The last name of the officer.
     * @param BadgeNumber The badge number of the officer.
     * @param RankNumber The rank number of the officer.
     * @param Address The address of the officer.
     * @param PhoneNumber The phone number of the officer.
     * @param AgencyID The ID of the law enforcement agency the officer belongs to.
     */
	public Officers(int OfficerID,String FirstName,String LastName,int BadgeNumber,int RankNumber,String Address,String PhoneNumber,int AgencyID) {
		super();
		this.OfficerID=OfficerID;
		this.FirstName=FirstName;
		this.LastName=LastName;
		this.BadgeNumber=BadgeNumber;
		this.RankNumber=RankNumber;
		this.Address=Address;
		this.PhoneNumber=PhoneNumber;
		this.AgencyID=AgencyID;
		}
// Getters and setters for the attributes
    
    // toString method to represent the Officers object as a string

	public int getOfficerID() {
		return OfficerID;
	}
	public void setOfficerID(int officerID) {
		OfficerID = officerID;
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
	public int getBadgeNumber() {
		return BadgeNumber;
	}
	public void setBadgeNumber(int badgeNumber) {
		BadgeNumber = badgeNumber;
	}
	public int getRankNumber() {
		return RankNumber;
	}
	public void setRankNumber(int rankNumber) {
		RankNumber = rankNumber;
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
	public int getAgencyID() {
		return AgencyID;
	}
	public void setAgencyID(int agencyID) {
		AgencyID = agencyID;
	}
	@Override
	public String toString() {
		return "Officers [OfficerID=" + OfficerID + ", FirstName=" + FirstName + ", LastName=" + LastName
				+ ", BadgeNumber=" + BadgeNumber + ", RankNumber=" + RankNumber + ", Address=" + Address
				+ ", PhoneNumber=" + PhoneNumber + ", AgencyID=" + AgencyID + "]";
	}
	
	
}
