import java.util.Arrays;

public class Task07 {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(5);
        System.out.println(matrix.getInfo());
        System.out.println(Arrays.deepToString(matrix.minAndMaxItemCow()));
    }
}
