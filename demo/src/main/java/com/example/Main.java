package com.example;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://4.216.182.145:3306/study", "root", "123456");
                Statement stat = connection.createStatement();) {
            ResultSet set = stat.executeQuery("select * from student;");
            
            while (set.next()) {
                int id = set.getInt("sid");
                String name = set.getString("name");
                String gender = set.getString("gender");
                System.out.println(id + "\t" + name + "\t" + gender);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
