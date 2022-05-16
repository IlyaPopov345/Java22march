package lab9;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String[] arr = str.split(";");
        int[] num = new int[arr.length];


        for (int i = 0; i < num.length; i++) {

            num[i] = Integer.parseInt(arr[i]);

        }
        for (int y = 0; y < arr.length; y++) {


            System.out.println(num[y] = '\u0023'); // как сделать зависимость смвола # от
            // значения соответсвующего элемента в массиве
        }
    }
}