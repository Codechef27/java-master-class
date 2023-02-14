public class Main {

    public static void main(String[] args) {
        Library library1 = new Library();
        Library library2 = new Library();

        System.out.println("---------------Library-1-Info--------------------");
        System.out.println(library1.name);
        System.out.println(library1.numOfBooksAvail);

        System.out.println("----------------Library-2-Info-------------------");
        System.out.println(library2.name);
        System.out.println(library2.numOfBooksAvail);

        System.out.println("---------------Library-Class-Info----------------------");
        System.out.println(Library.numOfBooksAvailInDistrict);
        System.out.println(Library.numOfOpenLibraries);
    }

    // methods
    // instance methods

}