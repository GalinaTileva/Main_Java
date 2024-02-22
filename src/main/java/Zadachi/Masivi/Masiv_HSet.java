package Zadachi.Masivi;

import java.util.HashSet;

public class Masiv_HSet {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,1,3,4,4,5,5,5,};
        HashSet<Integer> uniqueNumbers = new HashSet<>();

        for (int number : numbers) {
            uniqueNumbers.add(number);
        }

        for (int uniqueNumber : uniqueNumbers) {
            System.out.println(uniqueNumber);
        }
    }
}
