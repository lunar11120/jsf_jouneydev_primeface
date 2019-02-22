package com.jou.test;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

/**
 *
 * @author Theam
 */
public class Test1 {
    String derbyConnection = "org.apache.derby.jdbc.ClientDriver";
    String oracleConnection = "oracle.jdbc.driver.OracleDriver";
    Connection connection = null;    
    
    //Eclaim database [eclaimappl]
    String url = "jdbc:oracle:thin:@192.168.201.10:1549:DEVDB";
    String user = "eclaimappl";
    String password = "#0FCC5C2D#";
   
    //Seamless database [eclaimappl]
    String url_seamless = "jdbc:oracle:thin:@192.168.201.10:1549:DEVDB";
    String user_seamless = "SSI_APPL";
    String password_seamless = "3B55(CC98#";

    public static void main(String[] args) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        //Test Database Connection - Eclaim
        testConnection1();
        //Test Database Connection - Seamless
        testConnection1_seamless();     
        //example data --> Eclaim
        Test1.daoFindAll_Hcode();
    }
        
    public Connection getConnection_eclaim(){
        try {
            //Class.forName(derbyConnection);  
            Class.forName(oracleConnection).newInstance();
            connection = DriverManager.getConnection(url,user,password);
            System.out.println("[METHOD]getConnection_eclaim ====== success ****");
        } catch (Exception e) {
            System.out.println("JDBC connection error");
            System.out.println(e);
        }
        return connection;
    }
    
    public Connection getConnection_seamless(){
        try {
            //Class.forName(derbyConnection);  
            Class.forName(oracleConnection).newInstance();
            connection = DriverManager.getConnection(url_seamless,user_seamless,password_seamless);
             System.out.println("[METHOD]getConnection_seamless ====== success ****");
        } catch (Exception e) {
            System.out.println("JDBC connection error");
            System.out.println(e);
        }
        return connection;
    }    
    
    public static void testConnection1(){
        Test1 dbc = new Test1();
        System.out.println("Get CONN:" + dbc.getConnection_eclaim());
        if(dbc.getConnection_eclaim()!=null){
            System.out.println("Connection success ***********");
        }
    }
    
     public static void testConnection1_seamless(){
        Test1 dbc = new Test1();
        System.out.println("Get CONN:" + dbc.getConnection_seamless());
        if(dbc.getConnection_eclaim()!=null){
            System.out.println("Connection success ***********");
        }
    }   
    
    public static void  daoFindAll_Hcode() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
            Test1 obj1 = new Test1();        
            Connection connection = obj1.getConnection_eclaim();
            Statement statement = connection.createStatement();
		try {
                     // select data hcode
		    String sql_eclaim = "select  hosp_id ,hname  from l_hrib";
		    StringBuilder sb = new StringBuilder();
		    sb.append(sql_eclaim);
		    ResultSet rs = statement.executeQuery(sb.toString()); 
                    int count = 0;
		    while (rs.next()){
                          System.out.println("[ECLAIM SAMPLE DATA] hcode : "+rs.getString("hosp_id")+"  HNAME:"+rs.getString("hname"));
                          count++;
                          if(count >= 15)
                              break;
		     }
		} catch (Exception e) {e.printStackTrace();}

	}// end method daoFindAll_Hcode
    

}
/*
connectionPool--------------------------------------------
Eclaim Pool
username: eclaimappl
password : #0FCC5C2D#
jdbc:oracle:thin:@192.168.201.10:1549:DEVDB

oracle.jdbc.pool.OracleDataSource
*/