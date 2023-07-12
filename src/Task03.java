import java.util.Arrays;

public class Task03 {
    public static void main(String[] args) {
        int array[] = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 100);
        }
        System.out.println(Arrays.toString(array));
        int leftArray[] = new int[7];
        int rightArray[] = new int[8];
        System.arraycopy(array, 0, leftArray, 0, 7);
        System.arraycopy(array, 7, rightArray, 0, 8);
        //System.out.println(Arrays.toString(leftArray) + "\n" + Arrays.toString(rightArray));
        Arrays.sort(leftArray);
        Arrays.sort(rightArray);
        int rightTmp[] = new int[rightArray.length];
        for (int i = 0, j = rightTmp.length - 1; i < rightArray.length; i++, j--) {
            rightTmp[j] = rightArray[i];
        }
        for (int i = 0; i < rightArray.length; i++) {
            rightArray[i] = rightTmp[i];
        }
        //System.out.println(Arrays.toString(leftArray) + "\n" + Arrays.toString(rightArray));
        System.arraycopy(leftArray, 0, array, 0, 7);
        System.arraycopy(rightArray, 0, array, 7, 8);
        System.out.println(Arrays.toString(array));
    }
}
