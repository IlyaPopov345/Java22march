package lab11;

import java.util.Scanner;

public class task18 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String[] arr = str.split(" ");
        int[] num = new int[arr.length];
        int min;
        int sub = 0;

        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(arr[i]);
        }
        min = num[0];

        for (int y = 1; y < arr.length; y++) {
            if (min > num[y]) {
                min = num[y];
            }
        }
        for (int n = 0; n < arr.length; n++) {
            sub = num[n] - min;
            System.out.print(sub + " ");
        }
    }
}







