package hw2;
// Задача на math.random и if
public class Task3 {
    public static void main(String[] args) {
        int number = (int) (10 + Math.random() * 491);
        if ( number > 25 && number <= 200) {
            System.out.println("Число " + number + " содержится в интервале ( 25; 200]");
        } else {
            System.out.println( "Число " + number + " не содержится в интервале ( 25; 200]");}
        }
    }
