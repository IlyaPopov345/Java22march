package lab8;

import java.util.Scanner;
public class task8
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String[] arr = a.split(",");


        for (int y = arr.length-1; y >=0 ; y--)
        {
            System.out.print(" "+arr[y]);

        }











    }
}
