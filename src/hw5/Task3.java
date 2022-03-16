package hw5;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {

        String str = "в предложении все слова разной длины";
        String [] mas= str.split(" ");

        int max = 0;
        String word = "";

        for (int i = 0; i < mas.length; i++){
            if (mas[i].length() > max){
                max = mas[i].length();
                word = mas[i];
            }
        }
        System.out.println("Самое длинное слово: " + word);
    }
}