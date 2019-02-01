/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author c0592682
 */
public class JavaAssignment3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int customerId;
        int productId;
        
        Scanner kb = new Scanner(System.in);
        
                            //Asks for customer id for database search
        System.out.println("What is the customer ID?");
        
        customerId = kb.nextInt();
        String sqlCustomerDetails = "SELECT * FROM CUSTOMER WHERE CUSTOMER_ID = ?";
        
                            //Asks for product id for database search
        System.out.println("What is the Product ID?");
        
        productId = kb.nextInt();
        String sqlProductDetails = "SELECT * FROM PRODUCTS WHERE PRODUCT_ID = ?";
        
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");

        String jdbc = "jdbc:derby://localhost:1527/sample";
        
        Connection conn = DriverManager.getConnection(jdbc, "app", "app");
        
        PreparedStatement pstmtCustomer = conn.prepareStatement(sqlCustomerDetails);
        pstmtCustomer.setInt(1, customerId);
        
        ResultSet rs = pstmtCustomer.executeQuery();
        while(rs.next()) {
            int id = rs.getInt("CUSTOMER_ID");
            PreparedStatement pstmtProduct = conn.prepareStatement(sqlProductDetails);
            pstmtProduct.setInt(1, productId);
        }
        
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JavaAssignment3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JavaAssignment3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
