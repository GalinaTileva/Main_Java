package Zadachi.Masivi;

import java.util.HashSet;
//Програма, която приема списък от цели числа и извежда само уникалните числа от този списък.

public class Masiv_HSet {
    public static void main(String[] args) {
        int[] array = {1,2,3,1,3,4,4,5,5,5,};
        HashSet<Integer> tab = new HashSet<>();

        for (int number : array) {
            tab.add(number);
        }

        for (int uniqueNumber : tab) {
            System.out.println(uniqueNumber);
        }
    }
}
