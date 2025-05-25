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

        var plane = Movie.getMovie("C", "Funny Plane");
        plane.watchMovie();

        // This is one you can check the type of object at runtime, but it is not the most efficient way
        Object unknownGenre = Movie.getMovie("C", "Comedy");
        if (unknownGenre.getClass().getSimpleName() == "Comedy") {
            Comedy c = (Comedy) unknownGenre;
            c.watchComdey();
            // Below is a better way to check a type at runtime. Using "instanceOf"
        } else if (unknownGenre instanceof Adventure) {
            ((Adventure) unknownGenre).watchAdventure();
        }
    }
}
