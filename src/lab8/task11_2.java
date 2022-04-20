package lab8;

import java.util.Scanner;

public class task11_2 { public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String a = s.nextLine();
    String[] arr = a.split(" ");
    int i = 1;
    int b = 0;
    System.out.println(" Индекс последнего элемента " + (arr.length - i));
    System.out.println(" начение последнего элемента" + arr[arr.length - i]);
    System.out.println("  Вместо " + arr[b] + " пишем " + arr[arr.length - i]);
    System.out.println(" Элементы массива: ");

    arr[0] = arr[arr.length - i];

    for (int y = 0; y < arr.length; y++)
    { //System.out.print("#");
        System.out.print(" " + arr[y]);
    }
}
}
