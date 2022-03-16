package hw1;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if ((number > 9) & (number < 100)) {
        int sum = number / 10 + number % 10;
        System.out.println("Сумма цифр = " + sum);}
            else {
                System.out.println("Вы ввели неверное число");
        }
    }
}
