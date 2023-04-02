//Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.

package Lesson_4;

import java.util.LinkedList;

public class Task_1 {
    public static void main(String[] args) {
        int number_of_members = (int) ((Math.random() * (30 - 10)) + 10);
        LinkedList<Integer> integers = new LinkedList<>();
        for (int i = 0; i <= number_of_members - 1; i++) {
            int number = (int) ((Math.random() * (200 - 1)) + 1);
            integers.add(i, number);
        }
        System.out.printf("Исходный список: %s\n", integers);
        LinkedList<Integer> inverted_list = reverseLinkedList(integers);
        System.out.printf("Перевёрнутый список: %s\n", inverted_list);
    }
    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> integers)
    {
        LinkedList<Integer> reverse_linked_list = new LinkedList<>();
        for (int i = integers.size() - 1; i >= 0; i--) {
            reverse_linked_list.add(integers.get(i));
        }
        return reverse_linked_list;
    }
}

