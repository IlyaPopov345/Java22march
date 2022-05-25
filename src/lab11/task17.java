package lab11;

import java.util.Scanner;

public class task17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String[] arr = str.split("_");
        int[] num = new int[arr.length];
        int min;
        int max;
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(arr[i]);
        }
        min = num[0];
        max = num[0];
        System.out.println(" Ход решения: ");

        for (int y = 1; y < arr.length; y++) {
            if (min > num[y]) {
                min = num[y];
                System.out.println("Промежуточное минимальное " + min);
            }
            if (max < num[y]) {
                max = num[y];
                System.out.println("Промежуточное минимальное " + max);
            }

        }

        System.out.println("Итоговое минимальное  " + min);
        System.out.println("Итоговое максимальное  " + max);
        System.out.println(" Разница " + (max - min));
    }
}
