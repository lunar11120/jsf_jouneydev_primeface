package com.jou.dao;
/*
 *Derby Database Connection
 */

import java.sql.Connection;
import java.sql.DriverManager;


public class DB_Connection {
    
    String derbyConnection = "org.apache.derby.jdbc.ClientDriver";
    String derby_url = "jdbc:derby://localhost:1527/sample";
    String user = "app";
    String password = "app";
        
    public static void main(String[] args) {
        testConnection1();
    }
        
    public Connection getConnection(){
        Connection connection = null;      
        try {
            //Class.forName(derbyConnection);  
        	Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
            connection = DriverManager.getConnection(derby_url,user,password);
            
        } catch (Exception e) {
            System.out.println("JDBC connection error");
            System.out.println(e);
        }
        
        return connection;
    }
    
    public static void testConnection1(){
        DB_Connection dbc = new DB_Connection();
        System.out.println("Get CONN:" + dbc.getConnection());      
    }
    
}//end class DB_connection
