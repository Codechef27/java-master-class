public class NextMain {

    public static void main(String[] args) {

        Movies movie = Movies.getMovie("A","Jaws");
        movie.watchMovie();

        Adventure jaws = (Adventure) Movies.getMovie("A", "Jaws");
        jaws.watchMovie();

        Comedy comedy = (Comedy) Movies.getMovie("C", "Airplane");
        comedy.watchMovie();

        var airplane = Movies.getMovie("C", "Airplane");
        airplane.watchMovie();

    }
}
