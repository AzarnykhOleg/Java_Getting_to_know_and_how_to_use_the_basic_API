package Lesson_4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Реализовать простой калькулятор (+ - / *)
 * Ввод числа ->
 * Ввод знака ->
 * Ввод числа ->
 * В калькулятор добавьте возможность отменить последнюю операцию.
 * Пример
 * 1
 * +
 * 2
 * ответ:
 * 3
 * +
 * 4
 * ответ:
 * 7
 * Отмена
 * 3
 *
 * 3
 * ответ:
 * 9
 */

public class Task_3_1 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double in_1, in_2, ans = 0;
        char operator;
        ArrayList<Double> results = new ArrayList<>();
        System.out.print("Введите первое число: ");
        in_1 = in.nextDouble();
        System.out.print("Введите арифметическое действие (+, -, *, /): ");
        operator = in.next().charAt(0);
        while (true) {
            System.out.print("Введите cледующее число: ");
            in_2 = in.nextDouble();
            switch (operator) {
                case '+' -> ans = in_1 + in_2;
                case '-' -> ans = in_1 - in_2;
                case '*' -> ans = in_1 * in_2;
                case '/' -> ans = in_1 / in_2;
                default -> System.out.printf("При вводе данных допущена ошибка!");
            }
            results.add(ans);
            System.out.printf(
                    "Результат: %f\nВведите арифметическое действие (+, -, *, /). Для отмены одной операции введите !:",
                    ans);
            operator = in.next().charAt(0);
            if (operator == '!') {
                in_1 = results.get(results.size() - 2);
                results.remove(in_1);
                System.out.println(in_1);
                System.out.print("Введите арифметическое действие (+, -, *, /): ");
                operator = in.next().charAt(0);
            } else {
                in_1 = ans;
            }
        }
    }
}