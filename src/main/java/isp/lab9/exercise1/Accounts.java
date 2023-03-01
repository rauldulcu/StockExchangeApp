package isp.lab9.exercise1;
/*
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

class Accounts{
    public static void main(String[] args) {
        Connection conn = null;
        try {
            String url = "jdbc:sqlite:path-to-db/chinook/chinook.db";
            conn = DriverManager.getConnection(url);

            System.out.println("Got it!");

        } catch (SQLException e) {
            throw new Error("Problem", e);
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}*/