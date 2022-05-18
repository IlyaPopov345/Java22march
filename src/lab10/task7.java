package lab10;

public class task7 {
    public static void main(String[] args) {

        int a = 0;
        int b = 13;
        int c;
        int count = 0;

        System.out.print(" Ход решения:");
        for (int y = 100; y <= 1000; y++) {
            System.out.print( y + " ");
            a = y;
            c = y % b;
            if (c == 0) {
                System.out.print("+   ");
                count++;
            }
        }
        System.out.print ( " Ответ: " + count  );
    }
}
