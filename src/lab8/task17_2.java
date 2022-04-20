package lab8;

import java.util.Scanner;

public class task17_2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String[] arr = a.split(" ");
        String x;

        int n = 5;
        int i = 4;

        x = arr[arr.length - 1];
        while (i < arr.length - 1) {
            arr[n] = arr[i];
            n--;
            i--;
        }
        arr[n] = x;


        for (int y = 0; y < arr.length; y++) {
            System.out.print(" " + arr[y]);
        }
    }
}


