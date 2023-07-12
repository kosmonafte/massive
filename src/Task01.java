import java.lang.reflect.Array;
import java.util.Arrays;

public class Task01 {
    public static void main(String[] args) {
        int array[] = new int[5];
        int array2[] = new int[12];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*100);
        }
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random()*100);
        }

        //Для порверки ситуации с нулем
        //array[1] = array[3] = 0;
        //array2[3] = array2[7] = 0;

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

        //Сформировать третий массив содержащий одинаковые элементы в первых двух массивах
        int arrayResSize = 0;
        if (array.length < array2.length) {
            arrayResSize = array.length;
        } else {
            arrayResSize = array2.length;
        }
        int arrayRes3[] = new int[arrayResSize];
        int position3 = 0;
        boolean haveZero3 = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array[i] == array2[j]) {
                    if (array[i] == 0 && !haveZero3) {
                        arrayRes3[position3] = array[i];
                        position3++;
                        haveZero3 = true;
                        continue;
                    }
                    int m = 0;
                    for (int k = 0; k < arrayRes3.length; k++) {
                        if (array[i] == arrayRes3[k]) {
                            m++;
                        }
                    }
                    if (m == 0) {
                        arrayRes3[position3] = array[i];
                        position3++;
                    }
                }
            }
        }
        int  arrayRes3_1[] = new int[position3];
        System.arraycopy(arrayRes3, 0, arrayRes3_1, 0, position3);
        System.out.println("Третий массив, содержащий элементы общие для двух массивов");
        System.out.println(Arrays.toString(arrayRes3_1));

        //Сформировать третий массив, содержащий только
        //уникальные элементы каждого из массивов;

        int arrayRes4[] = new int[array.length + array2.length];
        int position4 = 0;
        for (int i = 0; i < array.length; i++) {
            int k = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    k++;
                }
            }
            if (k == 1) {
                arrayRes4[position4] = array[i];
                position4++;
            }
        }
        for (int i = 0; i < array2.length; i++) {
            int k = 0;
            for (int j = 0; j < array2.length; j++) {
                if (array2[i] == array2[j]) {
                    k++;
                }
            }
            if (k == 1) {
                arrayRes4[position4] = array2[i];
                position4++;
            }
        }
        System.out.println("Сформировать третий массив, содержащий только уникальные элементы каждого из массивов");
        //System.out.println(Arrays.toString(arrayRes4));
        int arrayRes4_1[] = new int[position4];
        System.arraycopy(arrayRes4, 0, arrayRes4_1, 0, position4);
        System.out.println(Arrays.toString(arrayRes4_1));

        //Сформировать третий массив, содержащий только
        //минимальное и максимальное значение каждого из
        //массивов.

        int arrayRes5[] = new int[4];
        int minArrTmp = array[0];
        int maxArrTmp = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minArrTmp) {
                minArrTmp = array[i];
            }
            if (array[i] > maxArrTmp) {
                maxArrTmp = array[i];
            }
        }
        arrayRes5[0] = minArrTmp;
        arrayRes5[1] = maxArrTmp;
        minArrTmp = array2[0];
        maxArrTmp = array2[0];
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] < minArrTmp) {
                minArrTmp = array2[i];
            }
            if (array2[i] > maxArrTmp) {
                maxArrTmp = array2[i];
            }
        }
        arrayRes5[2] = minArrTmp;
        arrayRes5[3] = maxArrTmp;
        System.out.println("Сформировать третий массив, содержащий только минимальное и максимальное значение каждого из массивов.");
        System.out.println(Arrays.toString(arrayRes5));
    }
}
