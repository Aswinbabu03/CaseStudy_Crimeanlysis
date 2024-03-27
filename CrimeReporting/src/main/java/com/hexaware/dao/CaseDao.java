package com.hexaware.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.hexaware.DBUtil.DbUtil;
import com.hexaware.model.Case;

/**
 * Data Access Object (DAO) class for interacting with the Cases table in the database.
 */
public class CaseDao {
	Connection con;
	PreparedStatement ps;
	Statement stmt;
	ResultSet rs;
	/**
     * Creates a new case entry in the database.
     * @param c The case object to be created
     */
	public void createCase(Case c) {
		try {
			con = DbUtil.getDBConn();
			ps = con.prepareStatement(
					"insert into Cases(caseid,casename,incidentid,incidentdate,Description,Status) values(?,?,?,?,?,?)");
			ps.setInt(1, c.getCaseID());
			ps.setString(2, c.getCaseName());
			ps.setInt(3, c.getIncidentID());
			ps.setDate(4, Date.valueOf(c.getIncidentDate()));
			ps.setString(5, c.getDescription());
			ps.setString(6, c.getStatus());
			int noofrows = ps.executeUpdate();
			System.out.println(noofrows + " inserted Successfully in DB");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	/**
     * Retrieves details of a specific case from the database.
     * @param c1 The case object representing the case to retrieve
     * @return True if the case is found, false otherwise
     */
	public boolean getCaseDetails(Case c1){
		boolean isPresent = false;
		try {
			con=DbUtil.getDBConn();
			stmt=con.createStatement();
			rs=stmt.executeQuery("select * from Cases where caseid=" + c1);
			if (rs.next()) {
				isPresent = true;
				System.out.print("CaseID :" + rs.getInt(1));
				System.out.print("CaseName :" + rs.getString(2));
				System.out.print("IncidentID :" + rs.getInt(3));
				System.out.print("IncidentDate :" + rs.getDate(3));
				System.out.println("Description :" + rs.getString(4));
				System.out.println("Status :" + rs.getString(5));
			} else {
				isPresent = false;
			}
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		return isPresent;
	}
	/**
     * Updates details of a specific case in the database.
     * @param c2 The case object representing the updated case details
     */
	public void updateCaseDetails(Case c2) {
		try {
			con=DbUtil.getDBConn();
			ps=con.prepareStatement("update Cases set CaseName=?,incidentid=?,incidentDate=?,description=?,status=? where caseid=?");
			ps.setString(1, c2.getCaseName());
			ps.setInt(2,c2.getIncidentID() );
			ps.setDate(3, Date.valueOf(c2.getIncidentDate()));
			ps.setString(4, c2.getDescription());
			ps.setString(5, c2.getStatus());
			ps.setInt(6,c2.getCaseID() );
			int noofrows=ps.executeUpdate();
			if(noofrows>0) {
				System.out.println("Case updated Successfully...");
			}else {
				System.out.println("No Case Found...");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	/**
     * Retrieves all cases from the database and prints their details.
     * @param c3 Unused parameter, can be null
     */
	public void viewCases(Case c3) {
		con = DbUtil.getDBConn();
		
		try {
			stmt=con.createStatement();
			rs=stmt.executeQuery("select * from Cases");
				
			while(rs.next()) {
				System.out.println("CaseID : " + rs.getInt(1));
				System.out.println("CaseName : " + rs.getString(2));
				System.out.println("IncidentID : " + rs.getInt(3));
				System.out.println("IncidentDate : " + rs.getDate(4));
				System.out.println("Description: " + rs.getString(5));
				System.out.println("Status : " + rs.getString(6));
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
	}

}
