// Дана json строка (можно сохранить в файл и читать из файла)
// [
//  {"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
//  {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
//  {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}
// ]
// Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].
// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> data = new ArrayList<>();
        File reader = new File("JsonToString.json");
        Scanner scanner = new Scanner(reader);
        while (scanner.hasNextLine()) {
            String temp = scanner.nextLine();
            if (temp.contains("\"")) {
                data.add(temp.replace("\"", "")
                        .replace(":", "")
                        .replace(",", "")
                        .strip()
                        .split(" ")[1]);
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < data.size(); i += 3) {
            result.append("Студент ")
                    .append(data.get(i))
                    .append(" получил ")
                    .append(data.get(i + 1))
                    .append(" по предмету ")
                    .append(data.get(i + 2))
                    .append(".\n");
        }
        System.out.println(result);
    }
}