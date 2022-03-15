package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnection {

   public static final String JDBC_URL = "jdbc:mysql://localhost:3306/product_manager_c1121g1";
   public static final String JDBC_username = "root";
   public static final String JDBC_password = "123456";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");

            connection = DriverManager.getConnection(JDBC_URL, JDBC_username, JDBC_password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
