package lab9;
import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String[] arr = str.split(" ");
        int m = s.nextInt();
        int[] num = new int[arr.length];

        for ( int i = 0; i < num.length  ; i++) {

    num[i] = Integer.parseInt(arr[i]);
    num[i]=num[i]*m;

}

        for ( int y = 0; y < num.length; y++) {
            System.out.print(" " +num[y]);
        }
    }
}