package movies;

public class Movies {

    public int id;
    public String title;
    public String genre;
    public int yearOfRelease;

    public Movies(int id, String title, String genre, int yearOfRelease) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.yearOfRelease = yearOfRelease;
    }

    public Movies() {}

    public Movies(String title, String genre, int yearOfRelease) {
        this.title = title;
        this.genre = genre;
        this.yearOfRelease = yearOfRelease;
    }
}

