public class DiagonalStar {

    public static void main(String[] args) {
        printSquareStar(8);
    }
    public static void printSquareStar(int number){

        if(number < 5){
            System.out.print("Invalid Value");
        } else {

            for(int rows = 1; rows <= number; rows++) {
                for(int columns = 1; columns <= number; columns++){
                    if((rows == 1) ||(rows == number) || (columns == 1) || columns == number) {
                        System.out.print("*");
                    } else if(rows == columns) {
                        System.out.print("*");
                    } else if (columns == (rows - number + 1)) {
                        System.out.print("*");
                    } else System.out.print(" ");
                }

                System.out.println(" ");
            }
        }

    }
 }
