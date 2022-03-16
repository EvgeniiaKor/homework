package hw4;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] mas = new int[11];

        // k1-счетчик 1, k0 - счетчик 0; m - счетчик -1.
        int k1 = 0;
        int k0 = 0;
        int m = 0;

        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (-2 + Math.random() * 4);
            if (mas[i] == -1) {
                m++;
            } else if (mas[i] == 1) {
                k1++;
            } else
                k0++;
        }
        System.out.println(Arrays.toString(mas));

        int max = Math.max(Math.max(k0, k1), m);

        if ( !((m == k0 && m == max) || (m == k1 && m == max) || (k0 == k1 && k0 == max))) {
        if (m == max) {
            System.out.println("В массиве больше всего -1: " + m + " шт");
        }else if (k0 == max) {
            System.out.println("В массиве больше всего 0: " + k0 + " шт");
        } else {
        System.out.println("В массиве больше всего 1: "+ k1 + " шт");
        }}
        }
    }
