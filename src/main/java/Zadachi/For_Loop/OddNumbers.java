package Zadachi;

public class OddNumbers {
    public static void main(String[] args) {
        for (int i = 0; i <= 300; i++) {
            if (i % 3 == 0 && i % 7 == 0) {
                System.out.println(i);
            }
        }
    }
}
