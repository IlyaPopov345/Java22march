package lab8;

import java.util.Scanner;

public class task3_2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String[] arr = a.split(" ");
        int i = s.nextInt();


        if (i >= arr.length || i <0 ) {
            System.out.println(" Число T должно быть в интервале [0, размер массива)");

        }
        else {

            System.out.println(" Элемент на индексе " + i + " содержит значени " + arr[i]);


            if (i > 0 && i < arr.length) {

                System.out.println(" Значение предыдущего элемента " + " это " + arr[i - 1]);

            } else {
                System.out.println("Предыдущий элемент не существует ");
            }

            int next = i + 1;
            if (i >= 0 && i+1 < arr.length) {

                System.out.println(" Значение следующего элемента " + " это " + arr[next]);
            } else {
                System.out.println("Следующий элемент не существует ");
            }


        }

    }


}
