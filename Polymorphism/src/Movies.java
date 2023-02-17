import java.util.Scanner;

public class Movies {

    public static void main(String[] args) {

//        Movies movie = Movies.getMovie("Science", "Star Wars");

        Scanner s = new Scanner(System.in);

        while(true) {
            System.out.println("Enter movie genre (type) (A for Adventure, C for Comedy, " + "S for Science Fiction, or Q " +
                    "to quit): " );

            String type = s.nextLine();
            if("Qq".contains(type)){
                break;
            }
            System.out.println(" enter a title: ");
            String title = s.nextLine();
            Movies movie = Movies.getMovie(type,title);
            movie.watchMovie();
        }



    }

    private String title;

    public Movies(String title) {
        this.title = title;
    }

    public void watchMovie() {

        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + " film.");
    }

    public static Movies getMovie(String type, String title) {
        return switch(type.toUpperCase().charAt(0)) {
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new ScienceFiction(title);
            default -> new Movies(title);
        };
    }
}

class Adventure extends Movies{

    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(" .. %s%n".repeat(3),
                "Pleasant scene",
                "Scary scene",
                "Something bad happens");
    }

    public void watchAdventure(){
        System.out.println("Watching an adventure");
    }
}

class Comedy extends Movies{

    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(" .. %s%n".repeat(3),
                "Something funny happens",
                "Something even funnier happens",
                "Happy ending");
    }
    public void watchComedy(){
        System.out.println("Watching a Comedy");
    }
}

class ScienceFiction extends Movies{

    public ScienceFiction(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(" .. %s%n".repeat(3),
                "Exciting scene",
                "Visual scene",
                "Something bad happens");
    }

    public void watchSciFi(){
        System.out.println("Watching a SciFi");
    }
}
