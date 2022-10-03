package Lesson2;

import static java.lang.System.out;

public class MainForLessonTwo {
    public static void main(String[] args){
        out.println(printSumm(0, 9));
        out.println(positiveOrNegative(0));
        out.println(negativeInt(-5));
        stringAndInteger("строка" , 7);
        out.println(leapYear(400));

    }



    public static boolean printSumm(int a, int b) {
       int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static int positiveOrNegative(int i) {
        if (i >= 0){
            out.println("Число положительное");
        }else {
            out.println("Число отрицатльное");
        }
        return i;
    }

    public static boolean negativeInt(int z) {
        return z < 0;
    }
    public static void stringAndInteger(String str, int x) {
        for (int z = 0; z < x; z++) {
                out.println(str);
        }
    }

    public static boolean leapYear(int d) {
        if (d % 400 == 0) {
            return true;
        }
        if (d % 100 == 0) {
            return false;
        }
        return (d % 4 == 0);
    }

}
