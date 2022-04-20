package lab8;

import java.util.Scanner;

public class task19 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String[] arr = a.split(" ");
        String q;


        q= arr[0];
        arr[0] =  arr[ arr.length-1];
        arr[arr.length-1]= q;

        q= arr[1];
        arr[1] =  arr[ arr.length-2];
        arr[arr.length-2]= q;
        q= arr[2];
        arr[2] =  arr[ arr.length-3];
        arr[arr.length-3]= q;

        for (int y = 0; y < arr.length; y++) {


            System.out.print(" " + arr[y]);

        }
    }}


