package lab16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.lang.NumberFormatException;

public class task3 {


    public static void main(String[] args) {
        File file = new File("resourser/task8733/test2.txt");

        try {
            Scanner s = new Scanner(file);
            double sum = 0;
            double x = 0;
            int count = 0;  // НЕ ЗНАЮ КАК СДЛЕАТЬ ЧТОБЫ  ПЕРВОЕ ЧИСЛО НЕ УЧАСТВОВАЛО  В РАСЧЕТЕ
// НЕ ЗНАЮ КАК СДЕЛАТЬ /Некорректный объем данных\
            try {

                while (s.hasNext()) {
                    String line = s.nextLine();
                    int i = Integer.parseInt(line);
                    if (i <= 20) {
                        sum = sum + i;
                    }

                    count++;
                }
                x = ((sum) / count);
                System.out.println(x);
            } catch (NumberFormatException p) {
                System.out.println("Не удается считать число");
            }


        } catch (FileNotFoundException ex) {
            System.out.print("Файл не найден " + file.getAbsolutePath());

        }
    }
}
