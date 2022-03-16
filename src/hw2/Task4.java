package hw2;

import java.util.Scanner;
// Задача на if
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Ваш возраст");
        double age = scanner.nextDouble();
        System.out.println("Введите Ваш опыт");
        double exp = scanner.nextDouble();
        if (age > 100) {
            System.out.println("Мы Вам перезвоним");
        } else if (exp < 5) {
            System.out.println("Вы подходите на должность стажёра");
        } else {
            System.out.println("Вы подходите на должность разработчика");
        }
    }
}
