package lab8;

import java.util.Scanner;

public class task12_2 {public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String a = s.nextLine();
    String[] arr = a.split(",");
    int i = s.nextInt();
    Scanner c = new Scanner(System.in);
    String b = c.nextLine();
    if (i >= arr.length || i <0 ) {

        System.out.println(" Число А должно быть в интервале [0, размер массива]");
    }
    else {

        arr[i] = b;

        for (int y = 0; y < arr.length; y++)
            System.out.print(" " + arr[y]);
    }
}
}
