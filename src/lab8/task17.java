package lab8;

import java.util.Scanner;

public class task17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String[] arr = a.split(" ");
        String x;
        String z ;
        int i = 0;
        x = arr[i];
        arr[i] = arr[arr.length - 1];
        while (i < arr.length - 1) {
            i++;
            z = arr[i];
            arr[i] = x;
            x = z;
        }
        for (int y = 0; y < arr.length; y++) {
            System.out.print(" " + arr[y]);
        }
    }
}
