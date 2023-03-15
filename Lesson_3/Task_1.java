//Пусть дан произвольный список целых чисел, удалить из него чётные числа

package Lesson_3;

import java.util.ArrayList;

public class Task_1 {
    public static void main(String[] args) {
        int number_of_members = (int) ((Math.random() * (30 - 10)) + 10);
        ArrayList<Integer> integers = new ArrayList<>(number_of_members);
        for (int i = 0; i <= number_of_members - 1; i++) {
            int number = (int) ((Math.random() * (200 - 1)) + 1);
            integers.add(i, number);
        }
        System.out.printf("Исходный список целых чисел: %s\n", integers);
        ArrayList<Integer> list_odd_numbers = new ArrayList<>();
        for (int i = 0; i < number_of_members; i++) {
            if ((integers.get(i) % 2) != 0) {
                list_odd_numbers.add(integers.get(i));
            }
        }
        System.out.printf("Список нечётных целых чисел: %s", list_odd_numbers);
    }
}
