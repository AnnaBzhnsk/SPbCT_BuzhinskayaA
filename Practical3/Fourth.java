import java.util.Scanner;
public class Fourth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество баллов: ");
        int num = in.nextInt();
        if (num >= 91) {
            System.out.print("Оценка: A");
        }
        if (num >= 81 & num <= 90) {
            System.out.print("Оценка: B");
        }
        if (num >= 71 & num <= 80) {
            System.out.print("Оценка: C");
        }
        if (num >= 51 & num <= 70) {
            System.out.print("Оценка: D");
        }
        if (num <= 50) {
            System.out.print("Оценка: F");
        }
    }

}
