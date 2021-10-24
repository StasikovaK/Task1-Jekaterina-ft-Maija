import movies.Movie;
import movies.MoviesController;
import movies.MoviesRepository;

public class Main {

    public static void main(String[] args) {
        MoviesController moviesController = new MoviesController();
//        moviesController.create(new Movie("Title1", "Genre1", 2020));
//        moviesController.create(new Movie("Title2", "Genre2", 2019));
//        moviesController.create(new Movie("Title3", "Genre3", 2018));

      //  moviesController.update(new Movie(1, "updated title", "updated year of release",1999));

        //moviesController.delete(3);

        System.out.println(moviesController.getAllMovies());

    }

}
