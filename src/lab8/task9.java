package lab8;

import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String[] arr = a.split(" ");
        int b = s.nextInt();
        int e = s.nextInt();
        if (b >= arr.length || b < 0) {
            System.out.println(" Число B должно быть в интервале [0, размер массива)");
            return;
        } else if (e >= arr.length || e < 0) {
            System.out.println(" Число E должно быть в интервале [0, размер массива)");
            return;
        }
        if (b <= e) {
            for (int y = b; y < e + 1; y++) {
                System.out.print(" " + arr[y]);
            }
        }
            else if (b >= e) {
                for (int y = e; y < b + 1; y++) {
                    System.out.print(" " + arr[y]);
                }


            }
        }
    }







