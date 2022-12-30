//* В калькулятор добавьте возможность отменить последнюю операцию.

package HW_Java.HW_Seminar_4;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
    
public class task3 
{
        public static void main(String[] args) 
        {
            ArrayList<Object> arrayCalc = new ArrayList<>();
            Scanner input = new Scanner(System.in);
            System.out.print("Enter first number: ");
            arrayCalc.add(input.nextLine());
            System.out.print("Enter the operator */+-: ");
            arrayCalc.add(input.nextLine());
            System.out.print("Enter the second number: ");
            arrayCalc.add(input.nextLine());
    
    
            System.out.print("Do you want to change the operator? y/n: ");
            String newOp = input.nextLine();
            if (Objects.equals(newOp, "y"))
            {
                System.out.print("Enter another operator */+-: ");
                arrayCalc.set(1, input.nextLine());
                opCalc(arrayCalc);
            }
            else
            {
                opCalc(arrayCalc);
            }
        }
        private static void opCalc(ArrayList<Object> array) 
        {
            int num1 = Integer.parseInt((String) array.get(0));
            int num2 = Integer.parseInt((String) array.get(2));
            switch ((String) array.get(1)) 
            {
                case "*" ->
                {
                    int result = num1 * num2;
                    array.add(result);
                    System.out.print(result);
                }
    
                case "/" -> 
                {
                    if (num2 != 0) {
                        int result = num1 / num2;
                        array.add(result);
                        System.out.print(result);
                    }
                    else {
                        System.out.print("You can't divide by zero\n");
                    }
                }
                case "+" -> 
                {
                    int result = num1 + num2;
                    array.add(result);
                    System.out.print(result);
                }
                case "-" -> 
                {
                    int result = num1 - num2;
                    array.add(result);
                    System.out.print(result);
                }
                default -> System.out.print("Invalid enter");
            }
    
        }
} 
