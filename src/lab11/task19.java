package lab11;

import java.util.Scanner;

public class task19 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String[] arr = str.split(" ");
        int[] num = new int[arr.length];
        int p = s.nextInt();
        int q = s.nextInt();
int x=0;
        int min;

        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(arr[i]);
        }

        min = num[0];
        if (p >= num.length || p < 0) {
            System.out.println(" Число P должно быть в интервале [0, размер массива)");
            return;
        } else if (q >= num.length || q < 0) {
            System.out.println(" Число Q должно быть в интервале [0, размер массива)");
            return;
        }
        if (p <= q)

        { System.out.print(" Фрагмент массива:" );
            for (int y = p; y < q + 1; y++) {
                if (min > num[y]) {
                    min = num[y];
                }
                System.out.print(" " + num[y] );

            }

        }

         else if (p >= q) {
            System.out.print(" Фрагмент массива:" );
            for (int y = q; y < p + 1; y++) {
                if (min > num[y]) {
                    min = num[y];
                }
                System.out.print(" " + num[y]);


            }

        }
        System.out.println();
        System.out.println(" Минимальное среди них: " + min);
    }
}
