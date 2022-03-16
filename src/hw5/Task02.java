package hw5;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите слово");
        String str1 = scanner.nextLine();

        String capit = str1.substring(0, 1).toUpperCase() + str1.substring(1).toLowerCase();

        System.out.println(capit);
    }
}
