package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {

    private static String URL;
    private static String USERNAME;
    private static String PASSWORD;

    private static Connection singleton;

    public static void setConnection( Connection con ) {
        singleton = con;
    }

    public static Connection connection() throws ClassNotFoundException, SQLException {
        setDBCredentials();
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection( URL, USERNAME, PASSWORD );
        return conn;
    }

    public static void setDBCredentials() {
        URL = "jdbc:mysql://localhost:3306/bank?serverTimezone=CET";
        USERNAME = "root";
        PASSWORD = "root123";
    }
}