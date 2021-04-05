package Second;

import java.util.Scanner;

public class ThreeNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число a: \n");
        int num1 = in.nextInt();
        System.out.print("Введите число b: \n");
        int num2 = in.nextInt();
        System.out.print("Введите число c: \n");
        int num3 = in.nextInt();

        int a = num1 * 2;
        int b = num2 - 3;
        int c = num3*num3;
        int Sum = a+b+c;

        System.out.print("Увеличили a в 2 раза = " + a + "\n");
        System.out.print("Уменьшили b на 3 =  " + b + "\n");
        System.out.print("Возвели c в квадртат =  " + c + "\n");
        System.out.print("Сумма новых трех чисел =  " + Sum + "\n");
    }
}
