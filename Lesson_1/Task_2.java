package Lesson_1;

import java.util.ArrayList;
import java.util.List;

/**
 Вывести все простые числа от 1 до 1000
 СУТЬ РЕШЕНИЯ:
 Решето Эратосфена — алгоритм, предложенный древнегреческим математиком Эратосфеном.
 Вычеркнем из набора (отсеим) все числа делящиеся на 2, кроме 2.
 Перейдем к следующему «не отсеянному» числу — 3, снова вычеркиваем все что делится на 3.
 Переходим к следующему оставшемуся числу — 5 и так далее до тех пор пока мы не дойдем до n.
 После выполнения вышеописанных действий, в изначальном списке останутся только простые числа.
 */
public class Task_2
{
    public static void main(String[] args)
    {
        List < Integer > list = new ArrayList<>();
        for (int i = 2; i < 1001; i++)
        {
            list.add(i);
        }
        for (int i = 1; i < list.size(); i++)
        {
            for (int j = i + 1; j < list.size(); j++)
            {
                if (list.get(j) % i == 0)
                {
                    list.remove(j);
                }
            }
        }
        System.out.println(list);
    }
}
