package hw4;
import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {

        int mas[] = {1, 9, 5, 15, 45, 75, 1, 52, 61, 25, 13, 15, 9, 2, 10, 3, 234};

        int j = 0;     //j- индексы эл-в четного массива; k - индексы эл-в нечетного массива
        int k = 0;

        int n = 0;
        int m = 0;     // n - количество четных элементов, m- нечетных

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] % 2 == 0) {   // посчитаем кол-во четных и нечетных,чтобы определить длины новых массивов
                n++;
            } else {
                m++;
            }
        }

        int[] chet = new int[n];
        int[] nechet = new int[m];

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] % 2 == 0) {
                chet[j] = mas[i];
                j++;
            } else {
                nechet[k] = mas[i];
                k++;
            }
        }
        Arrays.sort(chet);
        Arrays.sort(nechet);
        System.out.println("Исходный массив " + Arrays.toString(mas));
        System.out.println("Четные " + Arrays.toString(chet));
        System.out.println("Нечетные " + Arrays.toString(nechet));
    }
}