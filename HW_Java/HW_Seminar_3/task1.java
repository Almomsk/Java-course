//Реализовать алгоритм сортировки слиянием

package HW_Java.HW_Seminar_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class task1 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int num = input.nextInt();
        System.out.print("Enter the range of array numbers from: ");
        int start = input.nextInt();
        System.out.print("Enter the range of array numbers up to: ");
        int end = input.nextInt();
        ThreadLocalRandom randomNum = ThreadLocalRandom.current();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < num; i++) 
        {
            arr.add(randomNum.nextInt(start, end));
        }
        System.out.println("Random array: " + arr);
        int[] array = arr.stream().mapToInt(i -> i).toArray();
        int[] sortarr = sortArray(array);
        System.out.println("Sorted array: " + Arrays.toString(sortarr));
    }
    private static int[] sortArray(int[] array)
    {
        if (array.length < 2)
        {
            return array;
        } 
        else 
        {
            int[] left = sortArray(Arrays.copyOfRange(array, 0, array.length/2));
            int[] right = sortArray(Arrays.copyOfRange(array,array.length / 2, array.length));
            return mergeArray(left ,right);
        }
    }
    private static int[] mergeArray(int[] left, int[] right)
    {
        int i = 0, j = 0, k = 0;
        int[] result = new int[left.length + right.length];
        while (i < left.length && j < right.length) 
        {
            if (left[i] < right[j]) 
            {
                result[k] = left[i];
                i++;
            } 
            else 
            {
                result[k] = right[j];
                j++;
            }
            k++;
        }
        if (i == left.length) 
        {
            while (j < right.length) 
            {
                result[k] = right[j];
                j++;k++;
            }
        }
        if (j == right.length) {
            while (i < left.length) 
            {
                result[k] = left[i];
                i++;k++;
            }
        }
        return result;
    }

}
