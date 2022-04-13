package lab8;

import java.util.Scanner;

public class task16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String[] arr = a.split(" ");
        String b;
        int p = s.nextInt();
        int q = s.nextInt();
        if (p < 0 || p > arr.length) {

            System.out.print("Число P должно быть в интервале [0, размер массива]");
            return;
        }
        if (q < 0 || q > arr.length) {
            System.out.print("Число q должно быть в интервале [0, размер массива]");
            return;
        }

        else {

            System.out.println(" Меняю " + arr[p] + " На " + arr[q]);

            b = arr[q];
            arr[q] = arr[p];
            arr[p] = b;


            for (int y = 0; y < arr.length; y++) {
                System.out.print(" " + arr[y]);

            }
        }
    }
}

