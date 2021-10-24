package database;

import java.sql.*;

public class DBHandler {


    public static void main(String[] args) {

        String ConnectionUrl = "jdbc:mysql://localhost:3306/movies";
        String user = "";
        String pass = "";

        Connection connection;
            try {
                connection = DriverManager.getConnection(ConnectionUrl,user,pass);


                    String query = "CREATE TABLE movies(id INT auto_increment, title VARCHAR(255), yearOfRelease int)";

                PreparedStatement statement = connection.prepareStatement(query);

               statement.execute();

                System.out.println("Connection to database successful");
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("Error connecting to database");

            }

        }
    }

