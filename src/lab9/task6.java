package lab9;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String[] arr = str.split(";");




        for (int y = 0; y < arr.length; y++) {
            System.out.println( arr[y] = " #");
            // как сделать зависимость смвола # от
            // значения соответсвующего элемента в массиве
        }
    }
}