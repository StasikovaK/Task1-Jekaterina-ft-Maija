package movies;

import java.sql.SQLException;
import java.util.ArrayList;

public class MoviesController {
    MoviesRepository moviesRepository = new MoviesRepository();

    public String createMovie(Movies movie){
        moviesRepository.createMovie(movie);
        return "Movie created successfully";
    }
    public void updateMovie(Movies movie){

    }
    public ArrayList<Movies> getAllMovies(){
        return new ArrayList<>();
    }
    public Movies findMovie(String name){
        return new Movies();
    }
}
