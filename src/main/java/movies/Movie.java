package movies;

public class Movie {

    public int id;
    public String title;
    public String genre;
    public int yearOfRelease;

    public Movie(int id, String title, String genre, int yearOfRelease) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.yearOfRelease = yearOfRelease;
    }

    public Movie() {}

    public Movie(String title, String genre, int yearOfRelease) {
        this.title = title;
        this.genre = genre;
        this.yearOfRelease = yearOfRelease;
    }
    public String toString() {
        return "\nTitle - " + this.title +
                "\n Genre - " + this.genre +
                "\n Year Of Release - " + this.yearOfRelease ;

    }
}

