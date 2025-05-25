package Polymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Movie movie = Movie.getMovie("C", "Star Wars");
//        movie.watchMovie();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter: A for (Adventure), C for (Comedy), S for (Science Fiction), or E to exit. ");
            String type = scanner.next();
            if ("Ee".contains(type)) {
                break;
            }
            System.out.println("Enter a title: ");
            String title = scanner.next();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }

    }
}
