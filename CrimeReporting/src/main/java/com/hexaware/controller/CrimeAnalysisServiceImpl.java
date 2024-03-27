package com.hexaware.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.hexaware.dao.CaseDao;
import com.hexaware.dao.IncidentDao;
import com.hexaware.model.Case;
import com.hexaware.model.Incidents;
/**
 * Implementation of the CrimeRepository interface for managing crime-related operations.
 */

public class CrimeAnalysisServiceImpl implements CrimeRepository {
    // Attributes
	Incidents incidents=new Incidents();
	Case cases=new Case();
	
	List<Case> caselist=new ArrayList<>();
	List<Incidents> incidentsList=new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	IncidentDao incidentDao=new IncidentDao();
	CaseDao caseDao=new CaseDao();

    // Methods

	@Override
	public void addIncident() {
		 // Implementation details...
		System.out.println("Enter the incident Id");
		int incidentId=sc.nextInt();
		incidents.setIncidentID(incidentId);
		
		
		System.out.println("Enter the incident Type");
		String incidentType=sc.next();
		incidents.setIncidentType(incidentType);
		
		
		System.out.println("Enter the incident Date");
		String incidentDate = sc.next();
		LocalDate date = LocalDate.parse(incidentDate);
		incidents.setIncidentDate(date);
		
		
		System.out.println("Enter the latitude");
		double latitude=sc.nextDouble();
		incidents.setLatitude(latitude);
		
		
		System.out.println("Enter the longitude");
		double longitude=sc.nextDouble();
		incidents.setLongitude(longitude);
		
		System.out.println("Enter the description");
		String description=sc.next();
		incidents.setDescription(description);
		
		System.out.println("Enter the status");
		String status=sc.next();
		incidents.setStatus(status);
		
		incidentDao.addIncident(incidents);
		incidentsList.add(incidents);
		System.out.println("Incidents "+incidents.getIncidentID()+" "+"Successfully added");
		
	}

	@Override
	public void updateIncidentStatus() {
		 // Implementation details...
		System.out.println("Enter IncidentId : ");
		int st = sc.nextInt();
		incidents.setIncidentID(st);
		System.out.println("Enter the status");
		String stat=sc.next();
		incidents.updateIncidentStatus(stat);
		//incidents.setStatus(s1);
		incidentDao.updateIncidentsStatus(incidents);
		System.out.println("IncidentStatus Successfully Added...");
		
	}

	@Override
	public void getIncidentsInDateRange() {
		 // Implementation details...
		System.out.println("Enter IncidentsInDateRange : ");
		//String incidentInDateRange = sc.next();
		//LocalDate date = LocalDate.parse(incidentInDateRange);
		//incidents.setIncidentDate();
		incidentDao.getIncidentsInDateRange(incidents);
	}
	@Override
	 public void SearchIncidentsByID(){
		 // Implementation details...
		System.out.println("Enter incident id");
		int incidentId = sc.nextInt();
		
			boolean IdAvailable = incidentDao.SearchIncidentsByID(incidentId);
			if(IdAvailable) {
			System.out.println("Incindets " + incidentId + " exists !!!");
		}else {
			System.out.println("Incindets " + incidentId + " doesn't exist !!!");
		}
		}
	@Override
	public void createCase() {
		 // Implementation details...
		System.out.println("Enter the Caseid");
		int caseid=sc.nextInt();
		cases.setCaseID(caseid);
		
		System.out.println("Enter the Casename");
		String casename=sc.next();
		cases.setCaseName(casename);
		
		System.out.println("Enter the Incidentid");
		int incidentid=sc.nextInt();
		cases.setIncidentID(incidentid);
		
		System.out.println("Enter the IncidentDate");
		String incidentDate=sc.next();
		LocalDate date = LocalDate.parse(incidentDate);
		cases.setIncidentDate(date);
		
		System.out.println("Enter the Description");
		String description=sc.next();
		cases.setDescription(description);
		
		System.out.println("Enter the Status");
		String status=sc.next();
		cases.setStatus(status);
		
		caseDao.createCase(cases);
		caselist.add(cases);
		System.out.println("Cases "+cases.getCaseID()+" "+"Successfully added");
		
		

	}

	@Override
	public void getCaseDetails() {
		 // Implementation details...
			System.out.println("Enter CaseID to retrieve Incidents in it...");
			int caseid = sc.nextInt();
			System.out.println("The Incidents for the given case id "+caseid+" : ");
			for(Case cases : caselist)
			{
				if(caseid == cases.getIncidentID())
				{
					System.out.println(cases.getIncidentID());
				}
			}
		}
	

	@Override
	public void updateCaseDetails() {
		 // Implementation details...
		cases=new Case();
		System.out.println("Enter the Caseid");
		int caseid=sc.nextInt();
		cases.setCaseID(caseid);
		
		System.out.println("Enter the Casename");
		String casename=sc.next();
		cases.setCaseName(casename);
		
		System.out.println("Enter the Incidentid");
		int incidentid=sc.nextInt();
		cases.setIncidentID(incidentid);
		
		System.out.println("Enter the IncidentDate");
		String incidentDate=sc.next();
		LocalDate date = LocalDate.parse(incidentDate);
		cases.setIncidentDate(date);
		
		System.out.println("Enter the Description");
		String description=sc.next();
		cases.setDescription(description);
		
		System.out.println("Enter the Status");
		String status=sc.next();
		cases.setStatus(status);
		
		caseDao.updateCaseDetails(cases);
		System.out.println("CaseDetails Successfully added...");
	}

	@Override
	public void viewCases() {
		 // Implementation details...
    	Iterator<Case> it = caselist.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
    }
}
