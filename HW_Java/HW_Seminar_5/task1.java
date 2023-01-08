///Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

package HW_Java.HW_Seminar_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        ArrayList<HashMap<String, ArrayList<String>>> phoneBook = new ArrayList<>();
        String[] fields = {"Ф.И.О.", "Телефон"};
        Scanner input = new Scanner(System.in);
        fillArray(phoneBook, fields, input);
        printBook(phoneBook,fields);
    }

    private static void fillArray(ArrayList<HashMap<String, ArrayList<String>>> phBook, String[] field, Scanner inp) {
        HashMap<String, ArrayList<String>> phB = new HashMap<>();
        for (int i = 0; i < field.length; i++) {
            ArrayList<String> temp = new ArrayList<>();
            if (i != field.length - 1) {
                System.out.println("Ф.И.О.: ");
                temp.add(inp.nextLine());
            } else {
                System.out.println("Сколько номеров хотите ввести? ");
                int countnum = inp.nextInt();
                inp.nextLine();
                for (int j = 0; j < countnum; j++) {
                    System.out.println("Телефон: ");
                    temp.add(inp.nextLine());
                }
            }
            phB.put(field[i], temp);
        }
        phBook.add(phB);
    }

    private static void printBook(ArrayList<HashMap<String, ArrayList<String>>> phBook, String[] field){
        for (HashMap<String, ArrayList<String>> map : phBook) {
            for (String fiel : field) {
                if (!fiel.equals("Телефон")) {
                    System.out.printf("%s = %s\n", fiel, map.get(fiel).get(0));
                } else {
                    for (int i = 0; i < map.get(fiel).size(); i++) {
                        System.out.printf("%s%d = %s\n", fiel, i + 1, map.get(fiel).get(i));
                    }
                }
            }
        }
        System.out.println("");
    }
}
