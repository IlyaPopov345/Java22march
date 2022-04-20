package lab8;

import java.util.Scanner;

public class task4_2 { public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    String a = s.nextLine();
    String[] arr= a.split("#");
    int i = 3;
    if ( i > arr.length && i >= 0)
    {
        System.out.println("Массив слишком маленький");
    }

    else {
        System.out.println("Индекс третьего элемента с конца  " + (arr.length - i));
        System.out.println("Значение этого элемента " + arr[arr.length - i]);
    }



}
}
