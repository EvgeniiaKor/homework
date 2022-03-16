package hw4;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] mas = new int[10];
        for (int i = 0; i < mas.length - 1; i++) {
            mas[0] = 20;
            mas[i + 1] = mas[i] - 2;}
        System.out.println(Arrays.toString(mas));

        }
    }
