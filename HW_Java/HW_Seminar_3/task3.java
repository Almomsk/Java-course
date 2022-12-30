//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

package HW_Java.HW_Seminar_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class task3
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
            int Sum = 0;
    
            for (int i = 0; i < num; i++) 
            {
            Sum += i;
            }
            double ArithMean = (double) Sum / num;
            System.out.println("Integer list: " + array);
            System.out.println("Maximum number: " + Collections.max(array));
            System.out.println("Minimum number: " + Collections.min(array));
            System.out.println("Arithmetic mean: " + ArithMean);
         }
}
