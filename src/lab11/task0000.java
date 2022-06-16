package lab11;

import java.util.Scanner;

public class task0000 {
   public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String[] arr = str.split(" ");

        int[] mas = new int[arr.length];

        double sum = 0;
        double x = 0;
        double average = 0;

        for (int i = 0; i < mas.length; i++) {
            mas[i] = Integer.parseInt(arr[i]);
        }

        for (int y = 0; y < mas.length; y++) {
            sum = sum + mas[y];
        }

        x = ((sum) / mas.length);

        for (int y = 0; y < mas.length; y++) {
            average = Math.abs(mas[y] - x);
            System.out.print(" " + average);
        }

    }
}



