package lab16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.lang.NumberFormatException;
import java.util.NoSuchElementException;

public class task4 {
    public static void main(String[] args) {

        File file = new File("resourser/task5101/test6.txt");
        try {
            Scanner s = new Scanner(file);
            int x = 0;
            int count = 0;
            try {
                String line = s.nextLine();
                x = Integer.parseInt(line);
                while (s.hasNext()) {
                    line = s.nextLine();
                    int i = Integer.parseInt(line);
                    count++;

                }
                if (count == x) {
                    System.out.println("Равны");
                } else {
                    System.out.println("Не равны");
                }
            } catch (NumberFormatException p) {
                System.out.println("Не удается считать число");
            }

        } catch (FileNotFoundException ex) {
            System.out.print("Файл не найден " + file.getAbsolutePath());
        } catch (NoSuchElementException t) {
            System.out.print(" Файл пуст ");
        }

    }
}

