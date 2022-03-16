package hw3;
import java.util.Scanner;
public class Task2 {
    // задача на while
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int num = scanner.nextInt();
        int sum = 0;
        if (num > 0) {
            while (num / 10 > 0){
                sum = sum + num % 10;
                num = num / 10;
            }
            sum += num % 10;
            System.out.println(sum);
        } else {
            System.out.println("Число должно быть положительным");
            }
        }
}
