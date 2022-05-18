package lab10;

import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        String[] arr = str.split(" ");

        int[] num = new int[arr.length];
        double x = 0;
        for (int i = 0; i < num.length; i++) {

            num[i] = Integer.parseInt(arr[i]);
        }
        for (int i = 0; i < num.length ; i++) {

            x = (x + num[i]);

        }

        System.out.printf("%.6f", (x / arr.length) );
 // Сделать 9,  13, 9 в 9 лабе
    }
}