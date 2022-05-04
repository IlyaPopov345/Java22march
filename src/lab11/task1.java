package lab11;

import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String[] arr = new String[]{"a", "b", "c", "d", "e", "f", "g", "h"};

        for (int y = 0; y < arr.length; y++) {

            System.out.print(arr[y]);
            if (str.equals(arr[y])) { // str == arr[0]
                System.out.println(" Найдено ");
            } else {
                System.out.println();
            }
        }
    }
}
