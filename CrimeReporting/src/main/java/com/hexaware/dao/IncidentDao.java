package com.hexaware.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.hexaware.DBUtil.DbUtil;
import com.hexaware.model.Incidents;

/**
 * Data Access Object (DAO) class for interacting with the Incidents table in the database.
 */

public class IncidentDao {
	Connection con;
	PreparedStatement ps;
	Statement stmt;
	ResultSet rs;
	/**
     * Adds a new incident to the database.
     * @param incidents The incident object to be added
     */

	public void addIncident(Incidents incidents) {
		try {
			con=DbUtil.getDBConn();
			ps=con.prepareStatement("insert into incidents values(?,?,?,?,?,?,?)");
			ps.setInt(1,incidents.getIncidentID() );
			ps.setString(2, incidents.getIncidentType());
			ps.setDate(3, Date.valueOf(incidents.getIncidentDate()));
			ps.setDouble(4, incidents.getLatitude());
			ps.setDouble(5, incidents.getLongitude());
			ps.setString(6, incidents.getDescription());
			ps.setString(7, incidents.getStatus());
            int noofrows = ps.executeUpdate();
            System.out.println(noofrows +"inserted Successfully in DB");
			}catch(SQLException e) {
				e.printStackTrace();
			}
	}
	/**
     * Updates the status of an incident in the database.
     * @param incidents The incident object with updated status
     */
	public void updateIncidentsStatus(Incidents incidents) {
		try {
			con=DbUtil.getDBConn();
			ps=con.prepareStatement("update Incidents set status=? where incidentid=?");
//			
//			ps.setString(2, incidents.getIncidentType());
//			ps.setDate(3, Date.valueOf(incidents.getIncidentDate()));
//			ps.setDouble(4, incidents.getLatitude());
//			ps.setDouble(5, incidents.getLongitude());
//			ps.setString(6, incidents.getDescription());
			ps.setString(1, incidents.getStatus());
			ps.setInt(2,incidents.getIncidentID());
			int noofrows=ps.executeUpdate();
			if(noofrows>0) {
				System.out.println("Incident updated Successfully...");
			}else {
				System.out.println("No Incident Found...");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	/**
     * Retrieves incidents within a specified date range from the database.
     * @param incidents The incident object representing the date range
     */
		public void getIncidentsInDateRange(Incidents incidents) {
			try {
				con=DbUtil.getDBConn();
				ps=con.prepareStatement("select * from Incidents where incidentDate between 26-09-2002 and curdate()");
				//ps.setInt(1, incidents.getIncidentID());
				rs = ps.executeQuery();
				while(rs.next()) {
					System.out.println("IncidentID: "+rs.getInt(1)+"IncidentType: "+rs.getString(2)+"IncidentDate: "+rs.getDate(3)+"Description: "+rs.getString(4)+"Status: "+rs.getString(5));
				}

			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		/**
	     * Searches for an incident by its ID in the database.
	     * @param incidentId The ID of the incident to search for
	     * @return True if the incident is found, false otherwise
	     */
		public boolean SearchIncidentsByID(int incidentId){
			boolean isPresent = false;
			try {
				con=DbUtil.getDBConn();
				stmt=con.createStatement();
				rs=stmt.executeQuery("select * from Incidents where incidentid= " + incidentId);
				if (rs.next()) {
					isPresent = true;
					System.out.print("IncidentId :" + rs.getInt(1));
					System.out.print("IncidentType :" + rs.getString(2));
					System.out.print("IncidentDate :" + rs.getDate(3));
					System.out.print("Latitude :" + rs.getString(4));
					System.out.println("Longitude :" + rs.getString(5));
					System.out.println("Description :" + rs.getString(6));
					System.out.println("Status :" + rs.getString(7));
				} else {
					isPresent = false;
				}
			
			}catch(Exception e) {
				e.printStackTrace();
			}
			return isPresent;
		
		}
}
