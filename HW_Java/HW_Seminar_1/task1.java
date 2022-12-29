// 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Enter first number: ");
        int i = iScanner.nextInt();
        System.out.printf("Cube number is: %d\n", giveMeNumber(i));
        iScanner.close();
    }

    public static int giveMeNumber(int a) {
        return (a * (a + 1)) / 2;
    }
}