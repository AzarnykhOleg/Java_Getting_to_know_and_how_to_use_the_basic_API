//Задан целочисленный список ArrayList.
// Найти минимальное, максимальное и среднее ариф. из этого списка.

package Lesson_3;

import java.util.ArrayList;

public class Task_2 {
    public static void main(String[] args) {
        int number_of_members = (int) ((Math.random() * (10 - 5)) + 5);
        ArrayList<Integer> integers = new ArrayList<>(number_of_members);
        for (int i = 0; i <= number_of_members - 1; i++) {
            int number = (int) ((Math.random() * (50 - 1)) + 1);
            integers.add(i, number);
        }
        System.out.printf("Исходный список целых чисел: %s\n", integers);
        int minimum_number = integers.get(0);
        int maximum_number = integers.get(0);
        int sum_numbers = 0;
        for (Integer integer : integers) {
            sum_numbers = sum_numbers + integer;
            if (minimum_number > integer) {
                minimum_number = integer;
            } else if (maximum_number < integer) {
                maximum_number = integer;
            }
        }
        int arithmetic_mean = sum_numbers / integers.size();
        System.out.printf("Минимальное число: %s\n", minimum_number);
        System.out.printf("Максимальное число: %s\n", maximum_number);
        System.out.printf("Среднее арифметическое списка целых чисел: %s\n", arithmetic_mean);
    }
}
