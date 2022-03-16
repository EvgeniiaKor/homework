package hw3;
import java.util.Scanner;
public class Task3 {
    //задача на цикл
    public static void main(String[] args) {
        int numComp = (int) (1 + Math.random() * 9);
        int numYou = 20;
        Scanner scanner = new Scanner(System.in);
        System.out.println(numComp);
        while (numYou != 0){
            System.out.println("Угадайте число [1;9] ");
            numYou = scanner.nextInt();
            if (numYou == numComp) {
                System.out.println("Вы угадали");
                break;
            } if (numYou > numComp) {
                System.out.println("Загаданное число меньше");
            } if (numYou < numComp && numYou != 0){
                System.out.println("Загаданное число больше");
            }
            }
            }
    }
    //извините, не успеваю сегодня сделать задачу №4, выставлю сюда к след.занятию


