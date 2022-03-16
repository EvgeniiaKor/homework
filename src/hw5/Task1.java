package hw5;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите количество элементов массива");
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        String[] mas = new String[n];
        String k = "";
        String exit = "exit";

        System.out.println("Введите первое слово");
        String l = scanner.nextLine();
        scanner.nextLine();

        if (!(l.equalsIgnoreCase(exit))) {
            mas[0] = l;
            for (int i = 1; i < n; i++) {
                k = scanner.nextLine();
                if (k.equalsIgnoreCase(exit)) {
                    break;
                } else {
                    if (k != mas[i - 1]) {
                        mas[i] = k;
                    } else {
                        i--;
                    }
                }
            }
            System.out.println(Arrays.toString(mas));
        } else {
            System.out.println("0");
        }
    }
}
