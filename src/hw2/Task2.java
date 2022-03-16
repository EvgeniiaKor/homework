package hw2;

import java.util.Scanner;
// Задача на switch
public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите первый операнд");
        Scanner scanner = new Scanner(System.in);
        double operand_1 = scanner.nextDouble();
        System.out.println("Введите второй операнд");
        double operand_2 = scanner.nextDouble();
        System.out.println("Введите оператор");
        int operator = scanner.nextInt();

        switch (operator) {
            case 3:
                System.out.println(operand_1 + operand_2);
                break;
            case 5:
                System.out.println(operand_1 - operand_2);
                break;
            case 7:
                System.out.println(operand_1 * operand_2);
                break;
            case 9:
                System.out.println(operand_1 / operand_2);
                break;
            default:
                System.out.println("Ошибка оператора");
        }
    }
}
