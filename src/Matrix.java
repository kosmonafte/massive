import java.util.Scanner;

public class Matrix {
    private int array[][];
    public Matrix() {
        this.array = new int[3][3];
    }
    public void inputMatrix() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                this.array[i][j] = scanner.nextInt();
            }
        }
    }
}
