package lab8;

import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String[] arr = a.split(" ");
        int b = s.nextInt();
        int e = s.nextInt();




            for (int y = 0; y < arr.length; y++) {
                while (b < e ){
                    System.out.print(" " + arr[y]);
                }


            }
        }
    }



