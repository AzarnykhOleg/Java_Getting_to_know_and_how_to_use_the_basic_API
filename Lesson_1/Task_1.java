package Lesson_1;

/*
  Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
  Ввод:5
  Треугольное число 1 + 2 + 3 + 4 + 5 = 15
  n! 1 * 2 * 3 * 4 * 5 = 120
 */
import java.util.Scanner;

public class Task_1
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();
        int triangular_number = (num * (num + 1)) / 2;
        int factorial = 1;
        for (int i = 1; i <= num; i++)
        {
            factorial = factorial * i;
        }
        System.out.printf("Треугольное число %d: %d  \nФакториал числа %d: %d",num, triangular_number, num, factorial);
    }
}

