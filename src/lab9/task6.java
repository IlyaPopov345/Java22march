package lab9;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        if ( str.isEmpty()) {
            System.out.print( "Нет данных  ");
            return;
        }
        String[] arr = str.split(";");

        int[] num = new int[arr.length];
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            if (num[i ] < 0)

            {
                System.out.println();
                System.out.print("Элемент массива на индексе " + i + " меньше нуля");
                System.out.println();
            }

            else

            {
                for (int y = 0; y < num[i]; y++) {
                    System.out.print("#");
                }
                }
            }
            System.out.println();
        }


    }

