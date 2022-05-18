package lab9;

import java.util.Scanner;

public class task5 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(" Введите fragments ");

        String str = s.nextLine();
        if ( str.isEmpty()) {
            System.out.print( " Отсутствуют данные о фрагментах  ");
            return;
        }

        String[] fra = str.split(" ");

        System.out.println(" Введите indexes ");

        String str2 = s.nextLine();

        if ( str2.isEmpty()) {
            System.out.print( " Отсутствуют данные о фрагментах  ");
            return;
        }

        String[] ind = str2.split(" ");
        int[] num = new int[ind.length];



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
















