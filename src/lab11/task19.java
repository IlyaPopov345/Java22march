package lab11;

import java.util.Scanner;

public class task19 {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String[] arr = str.split(" ");
        int[] num = new int[arr.length];

        int q = s.nextInt();
        int min;
        int sub = 0;

        for (int p = s.nextInt(); p < arr.length; p++) {

            System.out.print(" Фрагмент массва " + arr[p]);
        }
    }
}
