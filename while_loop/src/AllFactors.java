public class AllFactors {

    public static void main(String[] args) {

        printFactors(6);

    }

    public static void printFactors(int number) {

        if(number < 0) {
            System.out.println("Invalid Value");
        }

        int x = 0;
        while(x < number ) {
            x++;
            if(number % x == 0) {
                System.out.println(x);
            }
        }

    }
}
