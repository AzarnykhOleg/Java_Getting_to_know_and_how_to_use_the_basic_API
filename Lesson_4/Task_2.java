//Реализуйте очередь с помощью LinkedList со следующими методами:
//        enqueue() - помещает элемент в конец очереди,
//        dequeue() - возвращает первый элемент из очереди и удаляет его,
//        first() - возвращает первый элемент из очереди, не удаляя.

package Lesson_4;

import java.util.LinkedList;

public class Task_2 {

    public static void main(String[] args) {

        int number_of_members = (int) ((Math.random() * (30 - 10)) + 10);
        LinkedList<Integer> integers = new LinkedList<>();
        for (int i = 0; i <= number_of_members - 1; i++) {
            int number = (int) ((Math.random() * (200 - 1)) + 1);
            integers.add(i, number);
        }

        System.out.println(integers);

        enqueue(integers, 9);
        System.out.println(integers);

        System.out.println(dequeue(integers));
        System.out.println(integers);

        System.out.println(first(integers));
        System.out.println(integers);
    }

    public static void enqueue(LinkedList<Integer> list, int num) {
        list.addLast(num);
    }

    public static int dequeue(LinkedList<Integer> list) {
        int num;
        num = list.get(0);
        list.remove(0);
        return num;
    }

    public static int first(LinkedList<Integer> list) {
        int num;
        num = list.get(0);
        return num;
    }
}

