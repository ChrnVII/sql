// package com.vii;

// import java.sql.*;

// public class Main {
//     public static void main(String[] args) {
//         String url = "jdbc:mysql://4.216.182.145:3306/study";
//         String url2 = "jdbc:mysql://localhost:3306/study";
//         try (Connection connection = DriverManager.getConnection(url2, "root", "123456");
//                 Statement stat = connection.createStatement();) {
//             ResultSet set = stat.executeQuery("select * from student;");

//             while (set.next()) {
//                 int id = set.getInt("sid");
//                 String name = set.getString("name");
//                 String gender = set.getString("gender");
//                 System.out.println(id + "\t" + name + "\t" + gender);
//             }
//         } catch (Exception e) {
//             e.printStackTrace();
//         }

//     }
// }
