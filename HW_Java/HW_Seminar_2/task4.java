//* К калькулятору из предыдущего дз добавить логирование.

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class task4 {
    public static void main(String[] args) throws IOException {
        FileHandler file = new FileHandler("Seminar_2/HW2/src/task4_log.xml", true);
        Logger logger = Logger.getLogger(task2.class.getName());
        Scanner input = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int firstNumber = input.nextInt();
        System.out.print("Введите второе число: ");
        int secondNumber = input.nextInt();
        System.out.print("Введите оператор */+- : ");
        String operator = input.next();
        logger.addHandler(file);
        StringBuilder text = new StringBuilder();
        switch (operator) {
            case "+" -> {
                text.append(firstNumber)
                        .append(" + ")
                        .append(secondNumber)
                        .append(" = ")
                        .append(firstNumber + secondNumber);
                System.out.println(text);
                logger.log(Level.INFO, String.valueOf(text));
            }
            case "-" -> {
                text.append(firstNumber)
                        .append(" - ")
                        .append(secondNumber)
                        .append(" = ")
                        .append(firstNumber + secondNumber);
                System.out.println(text);
                logger.log(Level.INFO, String.valueOf(text));
            }
            case "*" -> {
                text.append(firstNumber)
                        .append(" * ")
                        .append(secondNumber)
                        .append(" = ")
                        .append(firstNumber + secondNumber);
                System.out.println(text);
                logger.log(Level.INFO, String.valueOf(text));
            }
            case "/" -> {
                text.append(firstNumber)
                        .append(" / ")
                        .append(secondNumber)
                        .append(" = ")
                        .append(firstNumber + secondNumber);
                System.out.println(text);
                logger.log(Level.INFO, String.valueOf(text));
            }
            default -> System.out.print("Ошибка!");
        }
    }
}   

