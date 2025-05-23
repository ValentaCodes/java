package Polymorphism;

public class NextMain {
    public static void main(String[] args) {
        Movie movie = Movie.getMovie("C", "Star Wars");
        movie.watchMovie();

        Adventure jaws = (Adventure) Movie.getMovie("C", "Star wars");
        jaws.watchMovie();
        Object comedy = Movie.getMovie("C", "Airplane");
        Comedy comedyMovie = (Comedy) comedy;
//        Movie comedyMovie = (Movie) comedy;
//        comedyMovie.watchComedy();
//        comedy.watchMovie();

        var airplane = Movie.getMovie("S", "Space Balls");
        airplane.watchMovie();
    }
}
