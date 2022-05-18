package lab10;



public class task1 {

        public static void main(String[] args) {

            int sum = 0;

            System.out.print(" Ход решения:");
            for (int y = 100; y <= 500; y++)

            {
                sum = (sum + y);
                System.out.print(  sum + " ");

            }
            System.out.println( " Ответ: " + sum );
        }

}

