public class Task08 {
    public static void main(String[] args) {
        Matrix mtrx1 = new Matrix(2);
        Matrix mtrx2 = new Matrix(2);
        System.out.println(mtrx1.getInfo());
        System.out.println(mtrx2.getInfo());
        Matrix mtrx3 = mtrx1.multiplication(mtrx2);
        System.out.println(mtrx3.getInfo());
        Matrix mtrx4 = mtrx1.addition(mtrx2);
        System.out.println(mtrx4.getInfo());
        Matrix mtrx5 = mtrx1.subtraction(mtrx2);
        System.out.println(mtrx5.getInfo());

    }
}
