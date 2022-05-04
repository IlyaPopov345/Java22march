package lab9;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(" Введите левый массив ");
        String str = s.nextLine();
        String[] left = str.split(" ");
        int[] num = new int[left.length];
        System.out.println(" Введите правый массив массив ");
        Scanner b = new Scanner(System.in);
        String str2 = b.nextLine();
        String[] right = str2.split(" ");
        int[] num2 = new int[right.length];

         if (left.length< right.length || right.length< left.length ) {

        System.out.print("Размеры массивов должны быть одинаковы");
        return;

         }

        for (int i = 0; i < num.length; i++) {

            num[i] = Integer.parseInt(left[i]);
            num2[i] = Integer.parseInt(right[i]);
           num[i] = num[i] *  num2[i];

        }

        for (int y = 0; y < num.length; y++) {
            System.out.print(" " + num[y]);
        }
    }
}

