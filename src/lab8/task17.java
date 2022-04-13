package lab8;

import java.util.Scanner;

public class task17 {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String[] arr = a.split(" ");


// как сдвинуть массив


        for (int y = 0; y >arr.length-1; y++)
        {


            System.out.print(" " + arr[y]);
        }
    }
}
