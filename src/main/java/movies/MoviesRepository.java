package movies;

import database.DBHandler;

public class MoviesRepository {
DBHandler dbHandler = new DBHandler();

public void createMovie(Movies movies){
String query = "Insert into movies (title, genre, yearOfRelease) VALUES(?,?,?)";

}

}
