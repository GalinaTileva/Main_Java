package Zadachi;

public class Masiv_$ {
    public static void main(String[] args) {

        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = i * 5;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println("Елемент " + i + ": " + array[i]);

        }
    }
}
