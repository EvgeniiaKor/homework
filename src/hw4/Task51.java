package hw4;
import java.util.Arrays;

public class Task51 {
    public static void main(String[] args) {

        int mas[] = {-1,9,-7,15,-45,-75,1,-52,61,25,-13,-15,9,2,-10,3,-234};

        int k = 0;    //k - индексы эл-в отрицательного массива

        int n = 0;     // n - количество отрицательных элементов

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < 0) {   // посчитаем кол-во отрицательных,чтобы определить длину нового массива
                n++;
            }
        }

        int[] minus = new int[n];

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < 0) {
                minus[k] = mas[i];
                k++;
            }
        }
        System.out.println("Исходный массив " + Arrays.toString(mas));
        System.out.println("Отрицательные " + Arrays.toString(minus));
    }
}
