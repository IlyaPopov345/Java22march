import java.util.Scanner;

public class Methods {
    public static void task1860(String x) {
        System.out.println(" Мы стремимся к " + x);
    }


    public static void task4140(String x, String y) {
        System.out.println(" Меня зовут  " + x + "," + x + y + ".");
    }

    public static double task4411(double x) {
        return x + 7;

    }

    public static double task2790(double xDeg) {
        double xRad = (xDeg*Math.PI/180);
        return Math.sqrt(1 - Math.sin(xRad) * Math.sin(xRad));
    }
    public static double task3946(int[] num) {

        int sum = 0;
        int x=0;

        for (int y = 0; y < num.length; y++){
            sum = (sum + y);
        }
         x= (sum/num.length);
        return x;
    }
}