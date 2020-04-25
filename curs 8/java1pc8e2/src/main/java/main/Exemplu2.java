package main;

import java.sql.*;

public class Exemplu2 {

    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/java1pc8",
                "root",
                ""
        );

        Statement stmt = con.createStatement();

        String sql = "SELECT * FROM angajati";

        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            int id = rs.getInt("id");
            String nume = rs.getString("nume");
            int varsta = rs.getInt("varsta");


            System.out.println(id + " " + nume + " " + varsta);
        }
    }
}
