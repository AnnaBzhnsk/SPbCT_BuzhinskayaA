package Second;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите Градусы по Цельсию: \n");
        int num1 = in.nextInt();
        System.out.println("Градусы по Фаренгейту: \n" + convertCelsiusToFahrenheit(num1));
    }

    public static double convertCelsiusToFahrenheit(int сelsius) {
        double fahrenheit = 9 / 5.0 * сelsius + 32;
        return fahrenheit;
    }
}
