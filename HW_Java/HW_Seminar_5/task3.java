//Реализовать алгоритм пирамидальной сортировки (HeapSort). (Можно использовать массивы)

package HW_Java.HW_Seminar_5;

import java.util.Scanner;

public class task3 { 
        public static void main(String args[])
        {
            int array[] = {10, 8, 60, 2, 9, 1, 3, 7, 12, 13};
    
            System.out.println("Initial array: ");
            printArray(array);
            System.out.println();
            SortArray(array);
            System.out.println("Sorted array: ");
            printArray(array);
        }
    
        public static void SortArray(int arr[])
        {
            for (int i = arr.length / 2 - 1; i >= 0; i--)
                PyramSort(arr, arr.length, i);
            for (int i=arr.length-1; i>=0; i--)
            {
                int temp = arr[0];
                arr[0] = arr[i];
                arr[i] = temp;
                PyramSort(arr, i, 0);
            }
        }
    
        public static void PyramSort(int arr[], int n, int i)
        {
            int elem = i;
            int downFirst = 2*i + 1;
            int downSecond = 2*i + 2;
    
            if (downFirst < n && arr[downFirst] > arr[elem]) elem = downFirst;
    
            if (downSecond < n && arr[downSecond] > arr[elem]) elem = downSecond;
    
            if (elem != i)
            {
                int temp = arr[i];
                arr[i] = arr[elem];
                arr[elem] = temp;
                PyramSort(arr, n, elem);
            }
        }
    
        static void printArray(int arr[])
        {
            for (int i=0; i<arr.length; ++i) System.out.print(arr[i]+" ");
        }
}
