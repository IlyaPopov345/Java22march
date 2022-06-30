package lab16;

import java.util.Scanner;
public class testtask {

    public static void main(String[] args) {
        int a =1234;
        int i;
        for (int y = 0; y < 5; y++) {
            i = a % 10;
            a /= 10;
            System.out.println(a);
        }


    }
}
