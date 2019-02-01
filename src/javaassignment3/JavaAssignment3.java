/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment3;

import java.util.Scanner;

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
        int product_id;
        
        Scanner kb = new Scanner(System.in);
        
                            //Asks for customer id for database search
        System.out.println("What is the customer ID?");
        
        customerId = kb.nextInt();
        String sqlCustomerDetails = "SELECT * FROM CUSTOMER WHERE CUSTOMER_ID = ?";
        
                            //Asks for product id for database search
        System.out.println("What is the Product ID?");
        
        product_id = kb.nextInt();
        String sqlProductDetail = "SELECT * FROM PRODUCTS WHERE PRODUCT_ID = ?";
        
        
        
        
    }
    
}
