package lab9;

import java.util.Scanner;

public class task13 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String[] arr = str.split(",");

for ( int i = 0; i < arr.length; i++) {

    System.out.println(arr[0] + arr[i+1]);
    System.out.println(arr[i+1] + arr[0]);
    System.out.println(arr[0] + arr[i+1]);
    System.out.println(arr[1] + arr[2]);
    System.out.println(arr[2] + arr[1]);
    System.out.println(arr[2] + arr[1]);
    System.out.println(arr[3] + arr[2]);
    System.out.println(arr[2] + arr[3]);
    System.out.println(arr[1] + arr[2]);
}
// продолжить

    }
    }

