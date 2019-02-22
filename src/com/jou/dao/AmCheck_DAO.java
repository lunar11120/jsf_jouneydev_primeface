package com.jou.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jou.model.AmCheck;

@SuppressWarnings("unused")
public class AmCheck_DAO {
	
	DB_Connection dbconnect = new DB_Connection();
	Connection connection = dbconnect.getConnection();
	
	// Test Application
	public static void main(String[] args) throws SQLException {
		List<AmCheck> amList = new ArrayList<AmCheck>();
		AmCheck_DAO am1 = new AmCheck_DAO();
		amList = am1.daoFindAll();
		System.out.println(amList.toString());
	}	
	
	public List<AmCheck>  daoFindAll() throws SQLException {
		List<AmCheck> amList = new ArrayList<AmCheck>();
		Statement statement = connection.createStatement();

		try {
			// select data
			String sql2 = "SELECT * FROM APP.AMCHECK FETCH FIRST 100 ROWS ONLY";
			StringBuilder sb = new StringBuilder();
			sb.append("SELECT * FROM APP.AMCHECK FETCH FIRST 100 ROWS ONLY");
		    ResultSet rs = statement.executeQuery(sb.toString()); 
		      while (rs.next()){
		    	  AmCheck amc = new AmCheck();
		            amc.setName(rs.getString(1));
		            amc.setUrl(rs.getString(2));
		            amList.add(amc);
		        }
			
		} catch (Exception e) {e.printStackTrace();}

		return amList;
	}// end method daoFindAll
	
	
	public String insertAmCheck(AmCheck amCheck) throws SQLException {

		Connection dbConnection = null;
		PreparedStatement preparedStatement = null;
		String insertTableSQL = "INSERT INTO amcheck " 
					+ "VALUES (?,?,?,?)";
		
		AmCheck_DAO am1 = new AmCheck_DAO();
		
		java.util.Date today = new java.util.Date();

		int idrow = am1.genId()+1;

		try {
			preparedStatement = connection.prepareStatement(insertTableSQL);
			
            // set Object Data
			preparedStatement.setString(1, amCheck.getName());
			preparedStatement.setString(2, amCheck.getUrl());
			preparedStatement.setTimestamp(3, getCurrentTimeStamp());
			preparedStatement.setInt(4, idrow);

			// execute insert SQL stetement
			preparedStatement.executeUpdate();
			System.out.println("Record is inserted into AMCHECK TABLE");
			return "Insert : complete" +amCheck.toString();

		} catch (SQLException e) {System.out.println(e.getMessage()); return "Insert : fail";
		} finally {
			if (preparedStatement != null) {preparedStatement.close();}
			if (dbConnection != null) {dbConnection.close();}
		}		
	}//insertAmCheck
	
	public String updateAmCheck() {
		
		String updateTableSQL = "UPDATE amcheck SET url = ? "
                + " WHERE name = ?";		
		
		return "Insert : complete";
		
	}

	public Integer  genId() throws SQLException {
		List<AmCheck> amList = new ArrayList<AmCheck>();
		Statement statement = connection.createStatement();
        int numLast = 0;
		try {
			StringBuilder sb = new StringBuilder();
			sb.append("SELECT am.id FROM APP.AMCHECK am");
		    ResultSet rs = statement.executeQuery(sb.toString()); 
		      while (rs.next()){
		    	  numLast = rs.getInt(1);
		        }	
		} catch (Exception e) {e.printStackTrace();}
        System.out.println("show numlast"+numLast);
		return numLast;
	}// end method genId
		
	private static java.sql.Timestamp getCurrentTimeStamp() {

		java.util.Date today = new java.util.Date();
		return new java.sql.Timestamp(today.getTime());

	}	
}
