package Homework.Modul_Five;
/*Програма да сортира ArrayList от цели числа в нарастващ ред.*/

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();

        num.add(0);
        num.add(-8);
        num.add(45);
        num.add(12);
        num.add(21);

        sortArrayList(num);

        System.out.println("Sorted ArrayList: " + num);

    }

    private static void sortArrayList(ArrayList<Integer> num) {
        Collections.sort(num);

    }

}
