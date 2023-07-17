import java.util.Scanner;

public class Matrix {
    private int array[][];
    private int size;
    public Matrix() {
        this.size = 3;
        this.array = new int[this.size][this.size];
        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < this.size; j++) {
                this.array[i][j] = (int)(Math.random()*100);
            }
        }
    }
    public Matrix(int size) {
        this.size = size;
        this.array = new int[this.size][this.size];
        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < this.size; j++) {
                this.array[i][j] = (int)(Math.random()*100);
            }
        }
    }
    public String getInfo() {
        String str = new String();
        for (int i = 0; i < this.array.length; i++) {
            for (int j = 0; j < this.array[i].length; j++) {
                str += this.array[i][j];
                str += " ";
            }
            str += "\n";
        }
        return str;
    }
    public void inputMatrix() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Матрица на " + this.size + "x" + this.size + " элементов\nвведите поочередно все значения");
        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < this.size; j++) {
                this.array[i][j] = scanner.nextInt();
            }
        }
    }
    public int[][] minAndMaxItemRow(){
        int arrayItems[][] = new int[this.size][2];
        for (int i = 0; i < this.array.length; i++) {
            int minElem = this.array[i][0];
            int maxElem = this.array[i][0];
            for (int j = 0; j <this.array[i].length; j++) {
                if (minElem > this.array[i][j]) {
                    minElem = this.array[i][j];
                }
                if (maxElem < this.array[i][j]) {
                    maxElem = this.array[i][j];
                }
            }
            arrayItems[i][0] = minElem;
            arrayItems[i][1] = maxElem;
         }
        return arrayItems;
    }

    public int[][] minAndMaxItemCow(){
        int arrayItems[][] = new int[this.size][2];
        for (int i = 0; i < this.array.length; i++) {
            int minElem = this.array[0][i];
            int maxElem = this.array[0][i];
            for (int j = 0; j <this.array[i].length; j++) {
                if (minElem > this.array[j][i]) {
                    minElem = this.array[j][i];
                }
                if (maxElem < this.array[j][i]) {
                    maxElem = this.array[j][i];
                }
            }
            arrayItems[i][0] = minElem;
            arrayItems[i][1] = maxElem;
        }
        return arrayItems;
    }
    public Matrix multiplication(Matrix mtrx) {
        Matrix resMatrix = new Matrix(2);
        for (int i = 0; i < ; i++) {

        }
        return resMatrix;
    }
}
