package lab16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {

        File file = new File("resourser/task8733/test2.txt");
        int x = 0;
        int count = 0;
        int t;

        try {
            Scanner s = new Scanner(file);

            while (s.hasNext()) {
                String line = s.nextLine();

                System.out.print (line  +","); // ne pisat pered pervim zapiatuy
                }



        } catch (FileNotFoundException ex) {
            System.out.print("Файл не найден " + file.getAbsolutePath());

        }

    }
}
