public class Sum3And5Challenge {

    public static void main(String[] args) {
        int count = 0;
        int sumOfMatches = 0;

        for (int i = 1; i <= 1000; i++) {
            if((i % 3 == 0) && (i % 5 == 0)){
              count++;
              sumOfMatches += i;
              System.out.println("Found a match = " + i);
            }
            if(count == 5) {
                break;
            }
        }

        System.out.println("Sum = " + sumOfMatches);
    }
}
