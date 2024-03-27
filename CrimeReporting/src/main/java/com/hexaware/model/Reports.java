package com.hexaware.model;

import java.time.LocalDate;
/**
 * Represents a report generated for an incident.
 */

public class Reports {
	private int ReportID;// The ID of the report.
	private int IncidentID;// The ID of the incident associated with the report.
	private int ReportingOfficer; // The ID of the officer who generated the report.
	private LocalDate ReportDate;// The date when the report was generated.
	private String ReportDetails;// Details of the report.
	private String Status;// The status of the report (e.g., Draft, Finalized).

	/**
     * Default constructor for the Reports class.
     */

	public Reports() {
		System.out.println("From Reports Constructor...");
	}
	/**
     * Parameterized constructor for the Reports class.
     * @param ReportID The ID of the report.
     * @param IncidentID The ID of the incident associated with the report.
     * @param ReportingOfficer The ID of the officer who generated the report.
     * @param ReportDate The date when the report was generated.
     * @param ReportDetails Details of the report.
     * @param Status The status of the report.
     */
	public Reports(int ReportID,int IncidentID,int ReportingOfficer,LocalDate ReportDate,String ReportDetails,String Status) {
		super();
		this.ReportID=ReportID;
		this.IncidentID=IncidentID;
		this.ReportingOfficer=ReportingOfficer;
		this.ReportDate=ReportDate;
		this.ReportDetails=ReportDetails;
		this.Status=Status;
	}
    // Getters and setters for the attributes
    
    // toString method to represent the Reports object as a string

	public int getReportID() {
		return ReportID;
	}
	public void setReportID(int reportID) {
		ReportID = reportID;
	}
	public int getIncidentID() {
		return IncidentID;
	}
	public void setIncidentID(int incidentID) {
		IncidentID = incidentID;
	}
	public int getReportingOfficer() {
		return ReportingOfficer;
	}
	public void setReportingOfficer(int reportingOfficer) {
		ReportingOfficer = reportingOfficer;
	}
	public LocalDate getReportDate() {
		return ReportDate;
	}
	public void setReportDate(LocalDate reportDate) {
		ReportDate = reportDate;
	}
	public String getReportDetails() {
		return ReportDetails;
	}
	public void setReportDetails(String reportDetails) {
		ReportDetails = reportDetails;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	@Override
	public String toString() {
		return "Reports [ReportID=" + ReportID + ", IncidentID=" + IncidentID + ", ReportingOfficer=" + ReportingOfficer
				+ ", ReportDate=" + ReportDate + ", ReportDetails=" + ReportDetails + ", Status=" + Status + "]";
	}
	
	

}
