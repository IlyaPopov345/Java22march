package lab9;

import java.util.Scanner;

public class task8 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String[] arr = str.split(";");
        int[] num = new int[arr.length];
int p = 0;
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(arr[i]);
        }
        for (int y = 0; y < arr.length - 1; y++) {


            if (num[y]< num[y+1]) {

                p = y;

            }

         if (num[y] > num[y+1]) {

                    System.out.println(" Элемент со значением " + num[y + 1] + " на индексе  " + (y + 1) + " нарушает закономерность ");
                    return;
                }


           }

            }
        }





