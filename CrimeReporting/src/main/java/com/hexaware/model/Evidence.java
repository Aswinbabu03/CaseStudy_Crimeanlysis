package com.hexaware.model;
/**
 * Represents evidence related to an incident.
 */
public class Evidence {
	private int EvidenceID;// Unique identifier for the evidence
	private String Description;// Description of the evidence
	private double LocationFoundLatitude;// Latitude where the evidence was found
	private double LocationFoundLongitude;// Longitude where the evidence was found
	private int IncidentID;// ID of the incident associated with the evidence
	/**
     * Default constructor for the Evidence class.
     */

	public Evidence() {
		System.out.println("From Evidence Constructor");
	}
	/**
     * Parameterized constructor for the Evidence class.
     * @param EvidenceID Unique identifier for the evidence
     * @param Description Description of the evidence
     * @param LocationFoundLatitude Latitude where the evidence was found
     * @param LocationFoundLongitude Longitude where the evidence was found
     * @param IncidentID ID of the incident associated with the evidence
     */
	public Evidence(int EvidenceID,String Description,double LocationFoundLatitude,double LocationFoundLongitude,int IncidentID) {
		super();
		this.EvidenceID=EvidenceID;
		this.Description=Description;
		this.LocationFoundLatitude=LocationFoundLatitude;
		this.LocationFoundLongitude=LocationFoundLongitude;
		this.IncidentID=IncidentID;
	}
// Getters and setters for the attributes
    
    /**
     * Returns the unique identifier for the evidence.
     * @return EvidenceID
     */
	public int getEvidenceID() {
		return EvidenceID;
	}
	/**
     * Sets the unique identifier for the evidence.
     * @param evidenceID Unique identifier for the evidence
     */
	public void setEvidenceID(int evidenceID) {
		EvidenceID = evidenceID;
	}
// Similar documentation for other attributes and methods
    
    // toString() method
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public double getLocationFoundLatitude() {
		return LocationFoundLatitude;
	}
	public void setLocationFoundLatitude(double locationFoundLatitude) {
		LocationFoundLatitude = locationFoundLatitude;
	}
	public double getLocationFoundLongitude() {
		return LocationFoundLongitude;
	}
	public void setLocationFoundLongitude(double locationFoundLongitude) {
		LocationFoundLongitude = locationFoundLongitude;
	}
	public int getIncidentID() {
		return IncidentID;
	}
	public void setIncidentID(int incidentID) {
		IncidentID = incidentID;
	}
	@Override
	public String toString() {
		return "Evidence [EvidenceID=" + EvidenceID + ", Description=" + Description + ", LocationFoundLatitude="
				+ LocationFoundLatitude + ", LocationFoundLongitude=" + LocationFoundLongitude + ", IncidentID="
				+ IncidentID + "]";
	}
	

}
