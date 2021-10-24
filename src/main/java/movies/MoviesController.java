package movies;

import java.sql.SQLException;
import java.util.ArrayList;

public class MoviesController {
    MoviesRepository moviesRepository = new MoviesRepository();

    public String create(Movie movies) {
        try {
            moviesRepository.createMovie(movies);
            return "Movie created successfully";
        } catch (SQLException e) {
            e.printStackTrace();
            return "Error creating a movie";
        }
    }

    public String update(Movie movie) {
        try {
            moviesRepository.updateMovie(movie);
            return "Movie updated successfully";
        } catch (SQLException e) {
            e.printStackTrace();
            return "Error updating a movie";
        }

    }

    public String delete(Movie movie) {
        try {
            moviesRepository.deleteMovie(movie.id);
            return "Movie deleted successfully";
        } catch (SQLException e) {
            e.printStackTrace();
            return "Error deleting a movie";
        }
    }

    public ArrayList<Movie> getAllMovies() {
        try {
            return moviesRepository.getAllMovies();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}

//
//    public Movies findMovie(String name){
//        try {
//            return moviesRepository.getMovieByName(name);
//        } catch (SQLException e) {
//            System.out.println("Cannot retrieve movie from database");
//            e.printStackTrace();
//            return null;
//        }
//    }
//    public Movies findMovie(int id){
//        try {
//            return moviesRepository.getMovie(id);
//        } catch (SQLException e) {
//            System.out.println("Cannot find movie with id: " + id);
//            e.printStackTrace();
//            return null;
//        }
//    }

