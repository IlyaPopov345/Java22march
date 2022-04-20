package lab8;

import java.util.Scanner;

public class task5_2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String[] arr = a.split(";");
        int i = (arr.length-1)/2;
        System.out.println(" Длина массива: " + arr.length + " индекс " + i + " элемент " + arr[i]);


    }
}


