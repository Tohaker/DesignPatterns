package com.pluralsight.singleton;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DbSingletonDemo {

    public static void main(String[] args) {
        try {
            DbSingleton instance = DbSingleton.getInstance(); // Get the instance of the Singleton.

            long timeBefore = 0;
            long timeAfter = 0;

            System.out.println(instance);

            timeBefore = System.currentTimeMillis();
            Connection conn = instance.getConnection();
            timeAfter = System.currentTimeMillis();

            System.out.println(timeAfter - timeBefore);

            Statement sta;
            try {
                sta = conn.createStatement();
                int count = sta
                        .executeUpdate("CREATE TABLE Address (ID INT, StreetName VARCHAR(20),"
                                + " City VARCHAR(20))");
                System.out.println("Table created.");
                sta.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }

            timeBefore = System.currentTimeMillis();
            conn = instance.getConnection();
            timeAfter = System.currentTimeMillis();

            System.out.println(timeAfter - timeBefore);
        } catch (SQLException se) {
            se.printStackTrace();
        }
    }
}
