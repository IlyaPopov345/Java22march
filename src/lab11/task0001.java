package lab11;

import java.lang.IllegalArgumentException;

import java.util.Scanner;

public class task0001 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double result = 0;

            double a = s.nextInt();
            double b = s.nextInt();



            if (b<=0 ) {
                result = a * Math.sqrt(-7 * b);
                System.out.println(result);
            }
            else {

                System.out.print("Подкоренное выражение должно быть неотрицательно");
            }

    }
}


