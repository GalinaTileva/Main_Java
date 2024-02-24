package Zadachi.If_Else;

public class LotteryChecker {
    public static void main(String[] args) {

        checkText("lottery", "test");
    }

    public static void checkText (String text, String text2) {
        if (text.equals(text2)) {
            System.out.println("You win the big prize");
        } else {
            System.out.println("Try again");
        }
    }
}

