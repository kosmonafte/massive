import java.util.Arrays;
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
    public int getSize() {
        return this.size;
    }
    public int[][] getArray() {
        return this.array;
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

    public Matrix multiplication (Matrix mtrx) {
        Matrix resMat = new Matrix(2);
        int vertArray[] = new int[2];
        int gorizArray[] = new int[2];
        for (int i = 0; i < this.array.length; i++) {
            int multV = 1;
            int multG = 1;
            for (int j = 0; j < this.array[i].length; j++) {
                multV *= this.array[i][j];
                multG *= mtrx.getArray()[j][i];
            }
            vertArray[i] = multV;
            gorizArray[i] = multG;
        }
        for (int i = 0; i < resMat.getSize(); i++) {
            for (int j = 0; j < resMat.getArray().length; j++) {
                resMat.getArray()[i][j] = vertArray[i] * gorizArray[j];
            }
        }
        return resMat;
    }

    public Matrix addition (Matrix mtrx) {
        Matrix resMat = new Matrix(2);
        int vertArray[] = new int[2];
        int gorizArray[] = new int[2];
        for (int i = 0; i < this.array.length; i++) {
            for (int j = 0; j < this.array[i].length; j++) {
                resMat.getArray()[i][j] = this.array[i][j] + mtrx.getArray()[i][j];
            }
        }
        return resMat;
    }

    public Matrix subtraction (Matrix mtrx) {
        Matrix resMat = new Matrix(2);
        int vertArray[] = new int[2];
        int gorizArray[] = new int[2];
        for (int i = 0; i < this.array.length; i++) {
            for (int j = 0; j < this.array[i].length; j++) {
                resMat.getArray()[i][j] = this.array[i][j] - mtrx.getArray()[i][j];
            }
        }
        return resMat;
    }

    public Matrix(int index, int size, int tmp) {
        this.size = size;
        this.array = new int[this.size][this.size];
        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < this.size; j++) {
                //this.array[i][j] =
            }
        }
    }
}
