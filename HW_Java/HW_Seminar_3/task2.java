//Пусть дан произвольный список целых чисел, удалить из него четные числа

package HW_Java.HW_Seminar_3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class task2 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list size: ");
        int num = input.nextInt();
        ThreadLocalRandom randomNum = ThreadLocalRandom.current();
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < num; i++) 
        {
        array.add(randomNum.nextInt(0, 10));
        }
        System.out.println("An arbitrary list of integers: " + array);
        array.removeIf(number -> number % 2 == 0);
        System.out.println("List of odd numbers: " + array);
    }
}
