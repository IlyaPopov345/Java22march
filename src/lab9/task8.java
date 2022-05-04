package lab9;

import java.util.Scanner;

public class task8 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String[] arr = str.split(";");
        int[] num = new int[arr.length];

        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(arr[i]);
        }
        for (int y = 0; y < arr.length; y++) {

            if (num[y] <) {

                System.out.println(" Элемент со значением " + num[y] + " на индексе  " + y + " нарушает закономерность ");

            }
        }
    }
}


