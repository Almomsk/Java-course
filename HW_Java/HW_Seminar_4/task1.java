//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

package HW_Java.HW_Seminar_4;

import java.util.LinkedList;
import java.util.Scanner;

public class task1 
{
    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<Integer>();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int num = input.nextInt();
        for (int i = 0; i < num; i++) 
        {
            System.out.print("Enter element: ");
            int numElem = input.nextInt();
            list.add(numElem);
        }
        System.out.println(list);

        int temp = 0;
        while (temp != num - 1) 
        {
            list.add(num - temp, list.getFirst());
            list.removeFirst();
            temp++;
        }
        System.out.println(list);
    }
}

