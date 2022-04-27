package lab8;

import java.util.Scanner;

public class task17_2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String[] arr = a.split(" ");
        String x;

        int n = arr.length;
        int i = arr.length - 1;

        x = arr[arr.length - 1];
        while (0 < i) {
            n--;
            i--;
            arr[n] = arr[i];
            arr[i] = x;
        }

        for (int y = 0; y < arr.length; y++) {

            System.out.print(" " + arr[y]);
        }

    }
}


