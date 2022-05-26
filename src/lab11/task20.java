package lab11;

import java.util.Scanner;

public class task20 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String[] arr = str.split(" ");
        int[] num = new int[arr.length];
        int min;

        int b = 0;

        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(arr[i]);
        }
        min = num[0];

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();

        for (int y = 0; y < num.length; y++) { // находим минимальное число

            if (min > num[y]) {
                min = num[y];
            }
        }

                b = num[0];  // меняем значения местами
                num[0] = min; // НЕ ЗНАЮ КАК СДЕЛАТЬ ЦИКЛ
                num[3] = b;

            for (int n = 0; n < num.length; n++) {
                System.out.print(num[n] + " ");

                if (min > num[n]) {
                    min = num[n];
                }
            }
            b = num[1];
            num[1] = min;
            num[4] = b;

            System.out.println();

            for (int v = 0; v < num.length; v++) {
                System.out.print(num[v] + " ");


            }


        }

}





