import java.util.Arrays;
import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        int array[] = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*100);
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int input = scanner.nextInt();
        System.out.println(Arrays.binarySearch(array, input));
    }
}