package hw4;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] mas = new int[10];
        int min = 100;
        int max = 0;
        double sum = 0;
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 10);
            sum += mas[i];
        if (mas[i] > max) {
            max = mas[i];}
        if (mas[i]< min) {
            min = mas[i];}
        }
        System.out.println("Массив " + Arrays.toString(mas));
        System.out.println("Минимиальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее значение: " + sum/10);

        }
    }
