package lab8;

import java.util.Scanner;

public class task6_2 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String a = s.nextLine();
    String[] arr = a.split(" ");

    for (int i = 0; i < arr.length; i++) {

        System.out.println(  arr[i] + " " + i);

    }
}
}
