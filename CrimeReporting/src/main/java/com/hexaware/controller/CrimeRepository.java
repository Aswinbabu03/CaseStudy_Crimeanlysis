package com.hexaware.controller;
/**
 * Interface for managing crime-related data repository operations.
 */
public interface CrimeRepository {
	 /**
     * Adds a new incident to the repository.
     */
	public void addIncident();
	/**
     * Updates the status of an existing incident in the repository.
     */
	public void updateIncidentStatus();
	 /**
     * Retrieves incidents within a specified date range from the repository.
     */
	public void getIncidentsInDateRange();
	/**
     * Searches for incidents by their unique ID in the repository.
     */
	public void SearchIncidentsByID();
	/**
     * Creates a new case entry in the repository.
     */
	public void createCase();
	 /**
     * Retrieves details of a specific case from the repository.
     */
	public void getCaseDetails();
	 /**
     * Updates details of an existing case in the repository.
     */
	public void updateCaseDetails();
	/**
     * Retrieves and displays all cases stored in the repository.
     */
	public void viewCases();

	
}
