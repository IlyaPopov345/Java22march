package lab9;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String[] arr = str.split(",");
        int[] num = new int[arr.length];

        int t = 0;
        int u = 1;
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(arr[i]);

        }
        if (arr.length % 2 != 0) {

            while (u < arr.length) {
                System.out.println(" Сумма элементов " + arr[t] + " и " + arr[u] + " равна " + (num[t] + num[u]));
                t = t + 2;
                u = u + 2;

            }
            System.out.println(" У элемента " + arr[arr.length - 1] + " нет пары ");
        }
            else {


                while (u < arr.length) {
                    System.out.println(" Сумма элементов " + arr[t] + " и " + arr[u] + " равна " + (num[t] + num[u]));
                    t = t + 2;
                    u = u + 2;
                }
            }



    }
}

