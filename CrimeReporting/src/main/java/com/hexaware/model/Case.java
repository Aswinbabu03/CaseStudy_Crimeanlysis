package com.hexaware.model;

import java.time.LocalDate;
/**
 * Represents a legal case associated with an incident.
 */

public class Case { 
	private int CaseID;// Unique identifier for the case
	private String CaseName;// Name of the case
	private int IncidentID;// ID of the incident associated with the case
	private LocalDate IncidentDate;// Date of the incident
	private String Description;// Description of the case
	private String Status;// Current Status of the case
	/**
     * Default constructor for the Case class.
     */

	public Case() { //creating a case
		System.out.println("From Case Constructor...");
	}
	/**
     * Parameterized constructor for the Case class.
     * @param CaseID Unique identifier for the case
     * @param CaseName Name of the case
     * @param IncidentID ID of the incident associated with the case
     * @param IncidentDate Date of the incident
     * @param Description Description of the case
     * @param Status Current status of the case
     */
	public Case(int CaseID,String CaseName,int IncidentID,LocalDate IncidentDate,String Description,String Status) {
		super();
		this.CaseID=CaseID;
		this.CaseName=CaseName;
		this.IncidentID=IncidentID;
		this.IncidentDate=IncidentDate;
		this.Description=Description;
		this.Status=Status;
	}
 // Getters and setters for the attributes
    
    /**
     * Returns the unique identifier for the case.
     * @return CaseID
     */
	public int getCaseID() { 
		return CaseID;
	}
	/**
     * Sets the unique identifier for the case.
     * @param caseID Unique identifier for the case
     */
	public void setCaseID(int caseID) {
		CaseID = caseID;
	}
	
	public String getCaseName() {
		return CaseName;
		/**
	     * Sets the unique identifier for the case.
	     * @param caseName Unique identifier for the case
	     */
	}
	public void setCaseName(String caseName) {
		CaseName = caseName;
	}
	public int getIncidentID() {
		return IncidentID;
		/**
	     * Sets the unique identifier for the case.
	     * @param IncidentID Unique identifier for the case
	     */
	
	}
	public void setIncidentID(int incidentID) {
		IncidentID = incidentID;
	}
	public LocalDate getIncidentDate() {
		return IncidentDate;
		/**
	     * Sets the unique identifier for the case.
	     * @param IncidentDate Unique identifier for the case
	     */
		
	}
	public void setIncidentDate(LocalDate incidentDate) {
		IncidentDate = incidentDate;
	}
	public String getDescription() {
		return Description;
		/**
	     * Sets the unique identifier for the case.
	     * @param Description Unique identifier for the case
	     */
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getStatus() {
		return Status;
		/**
	     * Sets the unique identifier for the case.
	     * @param Status Unique identifier for the case
	     */
	}
	public void setStatus(String status) {
		Status = status;
	}
	@Override
	public String toString() {
		return "Case [CaseID=" + CaseID + ", CaseName=" + CaseName + ", IncidentID=" + IncidentID + ", IncidentDate="
				+ IncidentDate + ", Description=" + Description + ", Status=" + Status + "]";
	}
	
}
