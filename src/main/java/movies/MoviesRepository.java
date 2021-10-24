package movies;

import database.DBHandler;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MoviesRepository {
    public static void main(String[] args) {
        MoviesRepository moviesRepository = new MoviesRepository();
       // moviesRepository.createMovie(new Movies("Title1", "Genre1", 2020));
    }
DBHandler dbHandler = new DBHandler();

public void createMovie(Movie movies) throws SQLException {
    String query = "Insert into movies (title, genre, yearOfRelease) VALUES(?,?,?)";

    PreparedStatement preparedStatement = dbHandler.getConnection().prepareStatement(query);
    preparedStatement.setString(1, movies.title);
    preparedStatement.setString(2, movies.genre);
    preparedStatement.setInt(3, movies.yearOfRelease);

    preparedStatement.execute();
    preparedStatement.close();
}
public void updateMovie(Movie movies) throws SQLException {
    String query = "UPDATE movies SET title=?, genre=?, yearOfRelease=? WHERE id=?";
    PreparedStatement preparedStatement = dbHandler.getConnection().prepareStatement(query);
    preparedStatement.setString(1, movies.title);
    preparedStatement.setString(2, movies.genre);
    preparedStatement.setInt(3, movies.yearOfRelease);
    preparedStatement.setInt(4,movies.id);

    preparedStatement.execute();
    preparedStatement.close();
}
public void deleteMovie(int id) throws SQLException {
    String query = "DELETE FROM movies WHERE id=?";
    PreparedStatement preparedStatement = dbHandler.getConnection().prepareStatement(query);
    preparedStatement.setInt(1,id);

    preparedStatement.execute();
    preparedStatement.close();
}
public ArrayList<Movie> getAllMovies() throws SQLException {
    String query = "SELECT * FROM movies";

    Statement statement = dbHandler.getConnection().createStatement();
    ResultSet results = statement.executeQuery(query);
    ArrayList<Movie> movies = new ArrayList<>();

    while(results.next()) {
        int id = results.getInt("id");
        String movie = results.getString("movie");
        String genre = results.getString("genre");
        int yearOfRelease = results.getInt("yearOfRelease");
        Movie moviess = new Movie (movie, genre, yearOfRelease);
        movies.add(moviess);
    }
    return movies;
}
}
