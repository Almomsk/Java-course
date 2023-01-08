//Пусть дан список сотрудников:
//Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.

package HW_Java.HW_Seminar_5;

import java.util.*;

public class task2 {
    public static void main(String[] args) {

        Set<String> collaborators = new TreeSet<>();
        ArrayList<String> newList = new ArrayList<>();
        inpSet(collaborators, newList);
        Map<String, Integer> names = new LinkedHashMap<>();
        sortMap(newList,names);
        System.out.println(newList);
        System.out.println(names);

    }

    public static void inpSet(Set<String> set, ArrayList<String> list) {
        List<String> collaborator = List.of("Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина", "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова", "Марина Светлова", "Мария Савина", "Мария Рыкова", "Марина Лугова", "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов");

        for (int i = 0; i < collaborator.size(); i++) {
            String[] temp = collaborator.get(i).split(" ");
            list.add(temp[0]);
        }
        set.addAll(list);
    }

    private static void sortMap(ArrayList<String> list, Map<String, Integer> sortname) {
        for (String name : list) {
            if (sortname.containsKey(name)) {
                sortname.put(name, sortname.get(name) + 1);

            } else {
                sortname.put(name, 1);
            }
        }
    }
}    

