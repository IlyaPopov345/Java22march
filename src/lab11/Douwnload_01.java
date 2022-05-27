package lab11;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.util.Scanner;

public class Douwnload_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Введите URl");
        StringBuffer url = new StringBuffer(sc.next());
        url.insert(12, "ss");

        Desktop desktor = Desktop.getDesktop();
        try {

            desktor.browse(URI.create(url.toString()));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
