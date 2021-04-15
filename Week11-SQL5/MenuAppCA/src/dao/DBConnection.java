package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
  // holds connection string, static so belongs to the class instead of the
  // instance, only one shared by whole app
  private final static String URL = "jdbc:mysql://localhost:3306/teams";
  private final static String USERNAME = "root";
  private final static String PASSWORD = "Dolphins";
  private static Connection connection;
  // singleton pattern, allows use of connection outside the class
  private static DBConnection instance;

  // constructor
  // private so cannot construct an instance from outside this class
  private DBConnection(Connection connection) {
    this.connection = connection;
  }

  // gets the connection
  public static Connection getConnection() {
    if (instance == null) {
      try {
        connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        instance = new DBConnection(connection);
        System.out.println("Connection successful!");
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
    return DBConnection.connection;
  }
}// end class
