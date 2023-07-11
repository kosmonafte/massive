import java.lang.reflect.Array;
import java.util.Arrays;

public class Task01 {
    public static void main(String[] args) {
        int array[] = new int[5];
        int array2[] = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*100);
        }
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random()*100);
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));

        //Объединяем два массива в один
        int arrayRes1[] = new int[array.length + array2.length];
        for (int i = 0; i < array.length; i++) {
            arrayRes1[i] = array[i];
        }
        for (int i = 0; i < array2.length; i++) {
            arrayRes1[array.length + i] = array2[i];
        }
        System.out.println("Объединяем два массива в один");
        System.out.println(Arrays.toString(arrayRes1));

        //Объединяем два массива в один без повторений
        boolean haveZero = false;
        int arrayRes2[] = new int[array.length + array2.length];
        int position = 0;
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < arrayRes2.length; j++) {
                if (array[i] == arrayRes2[j]) {
                    if (array[i] == 0 && !haveZero) {
                        arrayRes2[position] = array[i];
                        position++;
                        haveZero = true;
                        continue;
                    }
                    count++;
                }
            }
            if (count == 0) {
                arrayRes2[position] = array[i];
                position++;
            }
        }
        for (int i = 0; i < array2.length; i++) {
            int count = 0;
            for (int j = 0; j < arrayRes2.length; j++) {
                if (array2[i] == arrayRes2[j]) {
                    if (array2[i] == 0 && !haveZero) {
                        arrayRes2[position] = array2[i];
                        position++;
                        haveZero = true;
                        continue;
                    }
                    count++;
                }
            }
            if (count == 0) {
                arrayRes2[position] = array2[i];
                position++;
            }
        }
        int arrayRes2_1[] = new int[position];
        System.arraycopy(arrayRes2, 0, arrayRes2_1, 0, position);
        System.out.println("Объединяем два массива в один без повторений");
        System.out.println(Arrays.toString(arrayRes2_1));
    }
}
