package lab9;

import java.util.Scanner;

public class task9 {


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String[] arr = str.split(" ");
        int[] num = new int[arr.length];
        int b = s.nextInt();
        int count = 0;
        if (b < 0 || b > arr.length) {

            System.out.print(" Число B должно быть в интервале [0, размер массива) ");
            return;
        }
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {

            if (num[i] < num[b]) {
                count++;

            }
        }
        System.out.println(" На позиции В находится " + num[b]);
        System.out.println(" Количество меньших " + count);


    }
}

