package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Exemplu1 {

    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/java1pc8",
            "root",
            ""
        );

        Statement stmt = con.createStatement();

        String sql = "INSERT INTO angajati VALUES (null, 'Gigel', 23)";

        stmt.execute(sql);
    }
}
