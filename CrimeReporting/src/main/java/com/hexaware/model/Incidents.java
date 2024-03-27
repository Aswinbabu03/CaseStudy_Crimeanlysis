package com.hexaware.model;

import java.time.LocalDate;
import java.util.List;
/**
 * Represents an incident report.
 */

public class Incidents {
	private int IncidentID;// The ID of the incident.
	private String IncidentType;// The type of the incident (e.g., Robbery, Homicide, Theft).
	private LocalDate IncidentDate;// The date of the incident.
	private double Latitude;// The latitude of the incident location.
	private double Longitude;// The longitude of the incident location.
	private String Description;// The description of the incident.
	private String Status;// The status of the incident (e.g., Open, Closed, Under Investigation).
	private List<Victims> VictimID;// The list of victims involved in the incident.
	private List<Suspects> SuspectID;// The list of suspects involved in the incident.

	/**
     * Default constructor for the Incidents class.
     */

	
	
	public Incidents() {
		System.out.println("From Incident Constructor...");
	}
	/**
     * Parameterized constructor for the Incidents class.
     * @param IncidentID The ID of the incident.
     * @param IncidentType The type of the incident.
     * @param IncidentDate The date of the incident.
     * @param Latitude The latitude of the incident location.
     * @param Longitude The longitude of the incident location.
     * @param Description The description of the incident.
     * @param Status The status of the incident.
     * @param VictimID The list of victims involved in the incident.
     * @param SuspectID The list of suspects involved in the incident.
     */
	public Incidents(int IncidentID,String IncidentType,LocalDate IncidentDate,double Latitude,double Longitude,String Description,String Status,List<Victims> VictimID,List<Suspects> SuspectID ){
		super();
		this.IncidentID=IncidentID;
		this.IncidentType=IncidentType;
		this.IncidentDate=IncidentDate;
		this.Latitude=Latitude;
		this.Longitude=Longitude;
		this.Description=Description;
		this.Status=Status;
		this.VictimID=VictimID;
		this.SuspectID=SuspectID;
	}
	// Getters and setters for the attributes

    // Method to update incident status

    // toString method to represent the Incidents object as a string
	public int getIncidentID() {
		return IncidentID;
	}
	public void setIncidentID(int incidentID) {
		IncidentID = incidentID;
	}
	public String getIncidentType() {
		return IncidentType;
	}
	public void setIncidentType(String incidentType) {
		IncidentType = incidentType;
	}
	public LocalDate getIncidentDate() {
		return IncidentDate;
	}
	public void setIncidentDate(LocalDate incidentDate) {
		IncidentDate = incidentDate;
	}
	public double getLatitude() {
		return Latitude;
	}
	public void setLatitude(double latitude) {
		Latitude = latitude;
	}
	public double getLongitude() {
		return Longitude;
	}
	public void setLongitude(double longitude) {
		Longitude = longitude;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public List<Victims> getVictimID() {
		return VictimID;
	}
	public void setVictimID(List<Victims> victimID) {
		VictimID = victimID;
	}
	public List<Suspects> getSuspectID() {
		return SuspectID;
	}
	public void setSuspectID(List<Suspects> suspectID) {
		SuspectID = suspectID;
	}
	@Override
	public String toString() {
		return "Incidents [IncidentID=" + IncidentID + ", IncidentType=" + IncidentType + ", IncidentDate="
				+ IncidentDate + ", Latitude=" + Latitude + ", Longitude=" + Longitude + ", Description=" + Description
				+ ", Status=" + Status + ", VictimID=" + VictimID + ", SuspectID=" + SuspectID + "]";
	}
	
	public void updateIncidentStatus(String Status) {
		this.Status=Status;
	}
	
//	public void SearchIncidentsByID(int IncidentID,String IncidentType,LocalDate IncidentDate,double Latitude,double Longitude,String Description,String Status) {
//		this.IncidentID=IncidentID;
//		this.IncidentType=IncidentType;
//		this.IncidentDate=IncidentDate;
//		this.Latitude=Latitude;
//		this.Longitude=Longitude;
//		this.Description=Description;
//		this.Status=Status;
//	}

}
