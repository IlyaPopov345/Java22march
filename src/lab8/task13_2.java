package lab8;

import java.util.Scanner;
public class task13_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String[] arr = a.split(" ");
        Scanner append = new Scanner(System.in);
        String x = append.nextLine();
        int i = s.nextInt(); // число а
        if(arr.length < i) // проверка, елси а больше длины массива arr, то мы создаём новый
        {
            String[] mas = new String[i + 1];
            for (int y = 0; y < mas.length; y++)

            {
                if (y == i)
                {
                    mas[y] = x;
                }
                else
                {
                    if(arr.length>y)
                    {
                        mas[y] =arr[y];
                    }
                    else
                    {
                        mas[y] ="empty";
                    }
                }
                System.out.print(" "+mas[y]);
            }
        }// иначе работаем со старым массивом
        else
        {
            for (int y = 0; y < arr.length; y++)
            {
            if (y == i)
            {
                arr[y] = x;
            }
            System.out.print(" "+arr[y]);
            }
        }
    }
}

