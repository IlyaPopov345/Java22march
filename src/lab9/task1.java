package lab9;

import java.util.Scanner;

public class task1 {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String[] arr = str.split(" ");
        int m = s.nextInt();
        int i=1;
        int[] num = new int [arr.length];

         while (i<m){
             i++;
             num[i] = Integer.parseInt(arr[m]);
        }
        for (int y = 0; y <arr.length ; y++) {

            System.out.print(" " + num[y]);
        }
    }
}

