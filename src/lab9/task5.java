package lab9;

import java.util.Scanner;

public class task5 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(" Введите fragments ");
        String str = s.nextLine();
        String[] fra = str.split(" ");

        System.out.println(" Введите indexes ");
        Scanner b = new Scanner(System.in);
        String str2 = b.nextLine();
        String[] ind = str2.split(" ");
        int[] num = new int[ind.length];

        if (fra.length == 0) {

            System.out.print(" Отсутствуют данные о фрагментах ");
            return;
        }
     else if    (num.length == 0) {
            System.out.print(" Отсутствуют данные о фрагментах ");
            return;
        }
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(ind[i]);
        }


        for (int y = 0; y < num.length; y++) {

            if (num[y] >= fra.length) {

                System.out.println(" Фрагмент на индексе " + num[y] + " отсутствует ");
            } else {
                System.out.println(" Значение элемента на индексе " + num[y] + " это " + fra[num[y]]);
            }


        }
    }
}
















