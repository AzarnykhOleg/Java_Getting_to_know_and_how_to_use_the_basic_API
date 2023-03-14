/*
Напишите метод, который принимает на вход строку (String) и определяет,
является ли строка палиндромом (возвращает boolean значение). Без встр. функций
*/

package Lesson_2;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите выражение (слово) => ");
        String palindrome = input.nextLine().toLowerCase();
        int counter = 0;
        for (int i = 0; i < palindrome.length() / 2; i++) {
            if (palindrome.charAt(i) != palindrome.charAt(palindrome.length() - i - 1)) {
                System.out.printf("%s - не палиндром.\n", palindrome);
                break;
            } else {
                counter++;
            }
        }
        if (((palindrome.length() % 2 == 0) & (palindrome.length() / 2 == counter)) | ((palindrome.length() % 2 != 0) & (palindrome.length() / 2 == counter) & (counter != 0))) {
            System.out.printf("%s - палиндром.\n", palindrome);
        }
    }
}

