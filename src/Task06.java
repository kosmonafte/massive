import java.util.Arrays;
import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Matrix mtrx = new Matrix(5);
        System.out.println(mtrx.getInfo());
        System.out.println(Arrays.deepToString(mtrx.minAndMaxItemRow()));


    }
}
