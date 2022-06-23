package lab16;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class task4 {
    public static void main(String[] args) {

        File file = new File("resourser/task5101/test2.txt");
        try {
            Scanner s = new Scanner(file);
            while (s.hasNext()) {
                String line = s.nextLine();
            }

        } catch (FileNotFoundException ex) {
            System.out.print("Файл не найден " + file.getAbsolutePath());

        }
    }
}
