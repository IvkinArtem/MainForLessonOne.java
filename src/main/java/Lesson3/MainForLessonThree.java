package Lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class MainForLessonThree {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        oneArray();
        array100();
        numSubstitution();
        diagonal();
        arrayLen();


    }



    private static void oneArray() {
        int[] numberSubstitution = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(numberSubstitution));
        for (int i = 0; i < numberSubstitution.length; i++) {
            if (numberSubstitution[i] == 1) {
                numberSubstitution[i] = 0;
            } else numberSubstitution[i] = 1;
        }
        System.out.println(Arrays.toString(numberSubstitution));
    }

    private static void array100() {
        int n = 1;
        int[] arr100 = new int[100];
        for (int i = 0; i < arr100.length; i++) {
            arr100[i] = n++;
        }
        System.out.println(Arrays.toString(arr100));
    }

    private static void numSubstitution() {
        int[] numSubstitution = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < numSubstitution.length; i++) {
            if (numSubstitution[i] < 6) {
                numSubstitution[i] = 2;
            }
        }
        System.out.println(Arrays.toString(numSubstitution));
    }

    private static void diagonal() {

        int[][] fillingSubDiagonal = new int[5][5];
        for (int i = 0; i < fillingSubDiagonal.length; i++) {
            for (int j = 0, x = fillingSubDiagonal[i].length - 1; j < fillingSubDiagonal[i].length; j++, x--) {
                if (i == j || i == x) fillingSubDiagonal[i][j] = 1;
                else fillingSubDiagonal[i][j] = 0;
                System.out.printf("%2d ", fillingSubDiagonal[i][j]);
            }
            System.out.println();
        }


    }

    private static void arrayLen() {
        int len = arraySize();
        int initialValue = filling();
        int [] lenInitialValue = new int[len];
        for (int i = 0; i <lenInitialValue.length; i++) {
            lenInitialValue[i] = initialValue;
        }
        System.out.println(Arrays.toString(lenInitialValue));

    }


    private static int arraySize() {
        while (true) {
            System.out.print("ВВедите размер массива ");
            if (in.hasNext()) {
                return in.nextInt();
            }
            System.out.println(in.next() + " - не число");
        }
    }

    private static int filling() {
        while (true) {
            System.out.print("ВВедите значение ячейки ");
            if (in.hasNext()) {
                return in.nextInt();
            }
            System.out.println(in.next() + " - не число");
        }
    }

}
