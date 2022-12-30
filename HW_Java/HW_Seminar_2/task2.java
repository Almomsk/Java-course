//Реализуйте алгоритм сортировки пузырьком числового массива,
// результат после каждой итерации запишите в лог-файл.

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;



public class task2
{
public static void main(String[] args) throws IOException 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int num = input.nextInt();
        int[] array = new int[num];
        SortMas(array, num);
        System.out.println(Arrays.toString(array));
    }
    private static void SortMas(int[] arr, int n) throws IOException {
        Logger logger = Logger.getLogger(task2.class.getName());
        logger.setLevel(Level.INFO);
        FileHandler file = new FileHandler("task2_log.xml", true);
        logger.addHandler(file);
        file.setFormatter(new SimpleFormatter());
        logger.log(Level.INFO, "Array before: " + Arrays.toString(arr) + "\n");
        System.out.println(Arrays.toString(arr));
        logger.log(Level.INFO, "Array after: " + Arrays.toString(arr) + "\n");

        ThreadLocalRandom randomNum = ThreadLocalRandom.current();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (randomNum.nextInt(0, 10));
        }

        logger.log(Level.INFO, "Array before: " + Arrays.toString(arr) + "\n");

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    logger.log(Level.INFO,Arrays.toString(arr) + "\n");
                }
            }
        }
        logger.log(Level.INFO, "Array after: " + Arrays.toString(arr) + "\n");
        file.close();
    }
}