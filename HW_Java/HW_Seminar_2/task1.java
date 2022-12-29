//Дана строка sql-запроса "SELECT * FROM students WHERE ".
//Сформируйте часть WHERE этого запроса, используя StringBuilder.
//Данные для фильтрации приведены ниже в виде json строки.
//Если значение null, то параметр не должен попадать в запрос.
//Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

import java.util.Objects;


public class task1 {
    public static void main(String[] args) {
        String temp;
        StringBuilder request = new StringBuilder("SELECT * FROM students WHERE ");
        String filtersString = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        String[] res = filtersString.replace("{\"", "")
                .replace("\":\"", " ")
                .replace("\", \"", " ")
                .replace("\"}", "").split(" ");
        for (int i = 0; i < res.length; i += 2) {
            if (i != 0) {
                temp = " AND ";
            }else {
                temp = "";
            }
            if (!Objects.equals(res[i + 1], "null")) {
                request.append(temp).append(res[i]).append(" = ").append("'").append(res[i + 1]).append("'");
            }
        }
        request.append(";");
        System.out.println(request);
    }
}