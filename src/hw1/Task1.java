package hw1;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите сумму");
        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt();
        double res = sum > 100_000 ? 0.9 * sum: sum;
        System.out.println(res);
    }
}