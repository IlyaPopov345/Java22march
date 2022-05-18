package lab8;

import java.util.Scanner;

public class task1 {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        if ( a.isEmpty()) {
            System.out.print( "Исходная строка пуста  ");
            return;
        }

        String[] arr = a.split(" ");
        int i = s.nextInt();

         if (i < 0 || i > arr.length)
         {

             System.out.print("Число A должно быть в интервале [0, размер массива)");

         }
else {

             System.out.println("В массиве длиной " + arr.length);
             System.out.println("На индексе " + i);
             System.out.println("Находится элемент со значением " + arr[i]);
         }
    }
}