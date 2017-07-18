/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author RENT
 * adrian.kozlowski@outlook.com
 */
public class JDBCTutorial {
    
    static private String url = "jdbc:mysql://localhost/books_db?serverTimezone=CET";
    static private String userName = "root";
    static private String password = "";
    
    public static void main (String...args) throws ClassNotFoundException, SQLException {
    DBConnectionManager dbConnectionManager = new DBConnectionManager(url,userName,password);
    Connection connection = dbConnectionManager.getConnection();
    java.sql.PreparedStatement ps = null;
    try {
        ps = connection.prepareStatement("INSERT INTO users (first_name, last_name) VALUES (?, ?)");
        ps.setString(1, "Roman");
        ps.setString(2, "Kowalski");
        ps.execute();
        
        ps = connection.prepareStatement("select id, first_name, last_name from users");
        ResultSet resultSet = ps.executeQuery();
        
        while (resultSet.next()){
        String firstName = resultSet.getString("first_name");        
        String lastName = resultSet.getString("last_name");
        
        
        System.out.println (firstName + " " +lastName);
    }    
    } catch (SQLException e) {
            e.printStackTrace();
            }
    }
}
