package lab16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {

        File file = new File("resourser/task8139/test2.txt");
        int x = 0;
        int count = 0;

        try {
            Scanner s = new Scanner(file);

            while (s.hasNext()) {
                String line = s.nextLine();
                int i = Integer.parseInt(line);

                for (int y = 0; y <9; y++){
                    if (i == y) {
                        count++;
                    }
                }
            }


            System.out.println( count++);

        } catch (FileNotFoundException ex) {
            System.out.print("Файл не найден " + file.getAbsolutePath());

        }
    }
}
