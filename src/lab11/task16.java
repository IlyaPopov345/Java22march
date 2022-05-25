package lab11;

import java.util.Scanner;

public class task16 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String[] arr = str.split(" ");
        int[] num = new int[arr.length];
        int p;
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(arr[i]);
        }
        System.out.println(" Ход решения: ");
        System.out.println(" Начинаю и запоминаю " + num[0]);
        p = num[0];

        for (int y = 1; y < arr.length; y++) {
            System.out.println(" Сравниваю " + p + " и " + num[y ]);
            if (p > num[y]) {
                System.out.println(" Вместо  " + p + " запонимаю  " + num[y]);
                p = num[y];

            }
        }
        System.out.println (" В массиве " + String.join(",", arr)+  " минимальный элемент это " + p );
    }
}