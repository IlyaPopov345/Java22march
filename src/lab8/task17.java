package lab8;

import java.util.Scanner;

public class task17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String[] arr = a.split(" ");
        String x;
        String z;
int i;
        x = arr[0];
        arr[0] = arr[arr.length - 1];
        z = arr[1];
        arr[1] = x;
        x = z;
        z = arr[2];
        arr[2] = x;
        x = z;
        z = arr[3];
        arr[3] = x;
        x = z;
        z = arr[4];
        arr[4] = x;
        arr[arr.length - 1] = z;


        for (int y = 0; y < arr.length; y++) {


            System.out.print(" " + arr[y]);

        }
    }
}
