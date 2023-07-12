import java.time.Month;
import java.util.Arrays;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        int input;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количетсво сотрудников");
        input = scanner.nextInt();
        int moneyArray[] = new int[input];
        for (int i = 0; i < moneyArray.length; i++) {
            moneyArray[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(moneyArray));
        System.out.println("1 - сортировать по возрастанию\n2 - сортированть по убыванию");
        input = scanner.nextInt();
        if (input == 1) {
            Arrays.sort(moneyArray);
        } else if (input == 2) {
            Arrays.sort(moneyArray);
            int reverseMoneyArray[] = new int[moneyArray.length];
            for (int i = 0, j = reverseMoneyArray.length - 1; i < moneyArray.length; i++, j--) {
                reverseMoneyArray[j] = moneyArray[i];
            }
            for (int i = 0; i < moneyArray.length; i++) {
                moneyArray[i] = reverseMoneyArray[i];
            }
        }
        System.out.println(Arrays.toString(moneyArray));
    }
}
