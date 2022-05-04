package lab8;

import java.util.Scanner;

public class task19 {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String[] arr = a.split(" ");
        String c;

        for (int i = 0; i < arr.length / 2; i++) {
           c= arr[arr.length - i - 1];
            arr[arr.length - i - 1] = arr[i];
            arr[i] = c;

        }
        for (int y = 0; y < arr.length; y++) {
            System.out.print(" " + arr[y]);
        }
    }
}
