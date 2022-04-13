import java.util.Scanner;

public class task15 {


    public static void main(String [] args ){

        String[] arr = {"ус", "пех", "про", "вал", "резерв"};
        int i = 0;
        arr[4] = arr[i];
        arr[3] = arr[4];

        i = i + 1;
        i = i + 1;
        arr[i] = arr[0];
        i = i + 1;
        arr[i] = arr[1];
        System.out.print(arr[2]);
        System.out.println(arr[3]);

    }
}