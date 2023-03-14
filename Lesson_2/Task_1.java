/*
Реализуйте алгоритм сортировки пузырьком числового массива (введён вами).
Результат после каждой итерации запишите в лог-файл.
*/

package Lesson_2;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class Task_1 {
    private static final Logger MYLOGGER;
    static {
        MYLOGGER = Logger.getLogger(Task_1.class.getName());
    }
    public static void main(String[] args) throws IOException {
        FileHandler fileTxt = new FileHandler("bubblesort.txt");
        SimpleFormatter formatterTxt = new SimpleFormatter();
        fileTxt.setFormatter(formatterTxt);
        MYLOGGER.addHandler(fileTxt);

        Scanner input = new Scanner(System.in);
        System.out.print("Какого размера массива будет введён? => ");
        int array_size = input.nextInt();
        int[] array = new int[array_size];
        for (int i = 0; i < array_size; i++) {
            System.out.printf("Введите %d элемент массива => ", i + 1);
            int num = input.nextInt();
            array[i] = num;
        }
        MYLOGGER.info("Введён массив: " + Arrays.toString(array));
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    MYLOGGER.info("Изменены позиции: " + array[j] + " и " + array[j + 1]);
                    MYLOGGER.info(Arrays.toString(array));
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}

