package lab8;

public class task14_2 {
    public static void main(String[] args)
{
    String[] arr = {"ус", "пех", "резерв", "вал", "про"};
    arr[2] = arr[0];
    arr[3] = arr[1];
    arr[0] = arr[4];
    arr[1] = arr[3];

    System.out.print(arr[2]);
    System.out.println(arr[3]);

}
}
