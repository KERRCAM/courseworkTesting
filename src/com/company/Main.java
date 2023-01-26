package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
        String DatabaseLocation = System.getProperty("user.dir") + "\\test1.accdb";
        try {
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://" + DatabaseLocation, "", "");
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);


            String sql = "INSERT INTO testTable(ID, name, age)" + "VALUES ('one', 'kerr', '17')";
            ResultSet rs = stmt.executeQuery(sql);


            rs.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Error in the SQL class: " + e);
        }
         */


        long initialTime = System.currentTimeMillis();
        Scanner input = new Scanner(System.in);
        System.out.println("enter: ");
        String strInput = "";
        strInput = input.next();
        long finalTime = System.currentTimeMillis();
        float sessionTime = (finalTime - initialTime) / 1000;
        System.out.println(sessionTime);


    }
}
