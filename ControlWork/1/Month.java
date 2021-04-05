package Third;

import java.util.Scanner;

public class Month {
    static int month;
    private  String [] months = {"January","February","March","April","May","June","July","August","September","October",
            "November","December"};

    public static void main (String [] arg)   {

        Scanner s = new Scanner(System.in);
        System.out.print("Введите номер месяца: ");
        month=s.nextInt();
        Month m = new Month();
        m.showMonth(month);


    } void showMonth(int n) {

        try {
            System.out.println(months[n-1]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Такого месяца не существует");
        }
    }
}
