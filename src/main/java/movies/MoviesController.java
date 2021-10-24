package movies;

import java.sql.SQLException;
import java.util.ArrayList;

public class MoviesController {
    MoviesRepository moviesRepository = new MoviesRepository();

    public String createMovie(Movies movie){
        moviesRepository.createMovie(movie);
        return "Movie created successfully";
    }
    public String updateMovie(Movies movie){
        moviesRepository.updateMovie(movie);
        return "Movie updated successfully";
    }
    public ArrayList<Movies> getAllMovies(){
        return moviesRepository.getAll();
    }
    public Movies findMovie(String name){
        try {
            return moviesRepository.getMovieByName(name);
        } catch (SQLException e) {
            System.out.println("Cannot retrieve movie from database");
            e.printStackTrace();
            return null;
        }
    }
    public Movies findMovie(int id){
        try {
            return moviesRepository.getMovie(id);
        } catch (SQLException e) {
            System.out.println("Cannot find movie with id: " + id);
            e.printStackTrace();
            return null;
        }
    }
}
