package hw5;

public class Task4 {
    public static void main(String[] args) {
        String str = "а роза упала на лапу Азора";
        String str1 = str.toLowerCase().replace(" ", "");
        String[] mas = str1.split("");

        boolean flag = true;
        int k = mas.length;
        int middle = mas.length / 2;

        for (int i = 0; i <= middle; i++) {
            if (!(mas[i].equals(mas[k-1]))) {
                flag = false;
            }
            k--;
        }

        if (flag == true) {
            System.out.println("является палиндромом");
        } else {
            System.out.println("не является палиндромом");
        }
    }
}
