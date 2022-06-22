package lab13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        File file = new File("resourser/task6175/test1.txt");

        try {
            Scanner s = new Scanner(file);

            while (s.hasNext()) {

                String line = s.nextLine();
                System.out.println(line);

            }


        } catch (FileNotFoundException ex) {
            System.out.print("Файл не найден " + file.getAbsolutePath());

        }


    }
}
