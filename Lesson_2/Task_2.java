/*
 Дана строка (получение через обычный текстовый файл!!!)

 "фамилия":"Иванов","оценка":"5","предмет":"Математика"
 "фамилия":"Петрова","оценка":"4","предмет":"Информатика"

 Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
 Студент [фамилия] получил [оценка] по предмету [предмет].

 Пример вывода:
 Студент Иванов получил 5 по предмету Математика.
 Студент Петрова получил 4 по предмету Информатика.
 Студент Краснов получил 5 по предмету Физика.
*/

package Lesson_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Task_2 {
    public static void main(String[] args) throws IOException {
        File file = new File("Task_2.txt");
        FileReader fr = new FileReader(file);
        BufferedReader reader = new BufferedReader(fr);
        String line = reader.readLine();
        while (line != null) {
            line = reader.readLine();
            StringBuilder result = new StringBuilder();
            if (line != null) {
                String[] parts = line.split(",");
                for (String part : parts) {
                    String[] kv = part.split(":");
                    switch (kv[0]) {
                        case "\"фамилия\"" -> {
                            result.append("Студент");
                            result.append(kv[1].replaceAll("\"", " "));
                        }
                        case "\"оценка\"" -> {
                            result.append("получил");
                            result.append(kv[1].replaceAll("\"", " "));
                        }
                        case "\"предмет\"" -> {
                            result.append("по предмету ");
                            result.append(kv[1].replaceAll("\"", ""));
                            result.append(".");
                        }
                    }
                }
                System.out.println(result);
            }
        }
    }
}