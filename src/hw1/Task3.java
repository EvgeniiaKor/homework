package hw1;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите высоту параллелепипеда");
        double vysota = scanner.nextDouble();
        System.out.println("Введите ширину параллелепипеда");
        double shirina = scanner.nextDouble();
        System.out.println("Введите длину параллелепипеда");
        double dlina = scanner.nextDouble();
            if ( vysota > 0 & shirina > 0 & dlina > 0) {
                double ploshad = 2 * ( vysota * shirina + shirina * dlina + vysota * dlina);
                System.out.println("Площадь поверхности параллелепипеда = " + ploshad);}
            else {
                System.out.println("Введены неверные данные");
            }
    }
}
