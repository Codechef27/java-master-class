import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        int[] myIntArray = new int[10];

        myIntArray[0] = 45;
        myIntArray[1] = 1;
        myIntArray[5] = 50;

        double[] myDoubleArray = new double[10];
        myDoubleArray [2] = 3.5;

        System.out.println(myDoubleArray[2]);

        int[] firstTen = {1, 2, 3, 4,5, 6, 7, 8, 9, 10};

        int arrLength = firstTen.length;

        System.out.println(arrLength);

        System.out.println("Last = " + firstTen[arrLength - 1]);

        int[] newArr;

        newArr = new int[5];
        for(int i = 0; i < newArr.length; i++){
            newArr[i] = newArr.length - i;
        }

        for( int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
        System.out.println();
        for (int element : newArr) {
            System.out.print(element + " ");
        }

        System.out.println();
        System.out.print(Arrays.toString(newArr));

        Object objectVar = newArr;
        if (objectVar instanceof int[]) {
            System.out.println("objectVar is really just an int array");
        }

        Object[] objectArr = new Object[3];
        objectArr[0] = "Hello ";
        objectArr[1] = "World, ";
        objectArr[2] = newArr;

        for (Object element : objectArr) {
            System.out.print(element);
        }

    }
}