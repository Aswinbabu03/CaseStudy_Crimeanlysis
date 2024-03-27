package com.hexaware.view;
import java.util.*;
import com.hexaware.controller.CrimeAnalysisServiceImpl;
import com.hexaware.controller.CrimeRepository;
/**
 * Main class for interacting with the Crime Analysis System.
 * Allows users to perform various operations related to incidents and cases.
 */
public class CrimeAnalysisMain {
	/**
     * Main method to start the Crime Analysis System.
     * @param args Command-line arguments (not used)
     */
	public static void main(String[] args) {
		// Instantiate the CrimeRepository interface

	    CrimeRepository cr=(CrimeRepository) new CrimeAnalysisServiceImpl();
		String ch = null;
		// Menu-driven interface
		do {
			Scanner sc1=new Scanner(System.in);
			System.out.println("1.Incidents");
			System.out.println("2.Case");
			
			int choice=sc1.nextInt();
			switch(choice) {
			case 1:{
				System.out.println("1.add Incident");
				System.out.println("2.Update Incident");
				System.out.println("3.getIncidentsInDateRange");
				System.out.println("4.Search Incidents by ID");
				int c=sc1.nextInt();
				switch(c) {
				case 1:{
					cr.addIncident();
					break;
				}
				case 2:{
					cr.updateIncidentStatus();
					break;
				}
				case 3:{
					cr.getIncidentsInDateRange();
					break;
				}
				case 4:{
					cr.SearchIncidentsByID();
					break;
				}
				default:{
					System.out.println("Enter the right choice. ");
				}
				}
				break;	
			}
			case 2:{
				System.out.println("1.Create a case");
				System.out.println("2.Retrieve case details");
				System.out.println("3.Update case details");
				System.out.println("4.View all cases");
				int c=sc1.nextInt();
				switch(c) {
				case 1:{
					cr.createCase();
					break;
				}
				case 2:{
					cr.getCaseDetails();
					break;
				}
				case 3:{
					cr.updateCaseDetails();
					break;
				}
				case 4:{
					cr.viewCases();
					break;
				}
				default:{
					System.out.println("Enter the right choice");
				}
			}
				break;
			}
		}
			System.out.println("Do you want to continue? Y or y");
			ch=sc1.next();
		} while (ch.equals("Y") || ch.equals("y"));
		System.out.println("Thanks for using our system !!!");
		System.exit(0);
		}

	
}
