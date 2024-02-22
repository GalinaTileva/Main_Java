package Zadachi;

public class ErrorMessage {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i % 10 == 0) {
                System.out.println("Error");
            } else {
                System.out.println(i);
            }
        }
    }
}
