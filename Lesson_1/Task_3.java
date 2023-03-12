package Lesson_1;

import java.util.Scanner;

/**
 Реализовать простой калькулятор (+ - / *)
 Ввод числа ->
 Ввод знака ->
 Ввод числа ->
 */
public class Task_3
{
    public static void main(String[] args)
    {
        Scanner in_1 = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double num_1 = in_1.nextDouble();

        Scanner in_2 = new Scanner(System.in);
        System.out.print("Введите арифметическое действие: ");
        char num_2 = in_2.next().charAt(0);

        Scanner in_3 = new Scanner(System.in);
        System.out.print("Введите второе число: ");
        double num_3 = in_3.nextDouble();

        double ans;

        switch(num_2)
        {
            case '+': ans = num_1 + num_3;
                break;
            case '-': ans = num_1 - num_3;
                break;
            case '*': ans = num_1 * num_3;
                break;
            case '/': ans = num_1 / num_3;
                break;
            default:  System.out.printf("При вводе данных допущена ошибка!");
                return;
        }
        System.out.println(ans);
    }
}
