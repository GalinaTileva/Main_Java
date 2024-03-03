package Homework.Modul_Five;
/*Програма, която премахва всички повторения от свързан списък/LinkedList*/

import java.util.LinkedList;
import java.util.HashSet;

public class Clear_Duplicates {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(1);

        System.out.println("Original Linked List: " + list);

        removeDuplicates(list);

        System.out.println("Linked List after duplicates removal: " + list);
    }

    public static void removeDuplicates(LinkedList<Integer> list) {

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < list.size(); i++) {
            Integer current = list.get(i);
            if (set.contains(current)) {
                list.remove(i);
                i--;
            } else {
                set.add(current);
            }
        }

    }
}
