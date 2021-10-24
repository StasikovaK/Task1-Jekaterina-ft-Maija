package database;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHandler {

        String ConnectionUrl = "jdbc:mysql://localhost:3306/movies";
        String user = "root";
        String pass = "root";

        Connection connection;

    public DBHandler() {
        try {
                connection = DriverManager.getConnection(ConnectionUrl,user,pass);
//
//                String query = "CREATE TABLE movies(id INT auto_increment, title VARCHAR(255), yearOfRelease int)";
//                PreparedStatement statement = connection.prepareStatement(query);
//               statement.execute();

                System.out.println("Connection to database successful");
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("Error connecting to database");

            }

        }
    public Connection getConnection() {
        return connection;
    }
    }

