package lab16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.lang.NumberFormatException;

public class task3 {


    public static void main(String[] args) {
        File file = new File("resourser/task8733/test9.txt");

        try {
            Scanner s = new Scanner(file);
            double sum = 0;
            double x = 0;
            int count = 0;
            int count2 = 0;
// НЕ ЗНАЮ КАК СДЕЛАТЬ /Некорректный объем данных\
            try {

                String line = s.nextLine();
                x = Integer.parseInt(line);

                while (s.hasNext()) {

                    line = s.nextLine();
                    int i = Integer.parseInt(line);
                    if (i <= 20) {
                        sum = sum + i;
                        count++;
                    }

                    if (count2 == x) {
                        System.out.println("Некорректный объем данных");
                        break;

                    }
                    count2++;
                }
                if (count2 ==  x) {
                    x = ((sum) / count);
                    System.out.println(x);
                    System.out.println("Всего строк:" + count2);
                }
               else   {
                    System.out.println("Некорректный объем данных2");
                }
            } catch (NumberFormatException p) {
                System.out.println("Не удается считать число");
            }


        } catch (FileNotFoundException ex) {
            System.out.print("Файл не найден " + file.getAbsolutePath());

        }
    }
}
