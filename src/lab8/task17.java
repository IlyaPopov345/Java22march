package lab8;

import java.util.Scanner;

public class task17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String[] arr = a.split(" ");
        String b;
        String c;
        String x;
        String z;
        String v;
        String n;

        b = arr[0];
       arr[0] =  arr[ arr.length-1];
       c = arr[0+1];
         arr[0+1] = b;


        arr[1+1] = arr[0+1];
        arr[2+1] = arr[1+1];
        arr[3+1] = arr[2+1];
        arr[4+1] = arr[3+1];


        for (int y = 0; y < arr.length; y++) {
            System.out.print(" " + arr[y]);
        }
    }
}
