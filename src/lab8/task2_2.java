package lab8;

import java.util.Scanner;

public class task2_2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String[] arr = a.split(",");
        int i = 0, n = 2, b = 3, c = 5;

        System.out.println(" Значение элемента на индексе " + i + " это " + arr[i]);
        if (arr.length <= n) {

            System.out.println("Нет элемента на индексе " + n);
        }
        else {
            System.out.println(" Значение элемента на индексе " + n + " это " + arr[n]);
        }
        if (arr.length <= b) {
            System.out.println("Нет элемента на индексе " + b);
        }
        else {
            System.out.println(" Значение элемента на индексе " + b + " это " + arr[b]);
        }
        if (arr.length <= c) {
            System.out.println("Нет элемента на индексе " + c);
        }
        else {
            System.out.println(" Значение элемента на индексе " + c + " это " + arr[c]);
        }

    }
}
