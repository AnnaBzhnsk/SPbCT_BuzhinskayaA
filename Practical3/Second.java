import java.util.Scanner;
public class Second {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите оценку: ");
        int num = in.nextInt();
        if (num == 5)
            System.out.print("Отлично");
        if (num == 4)
            System.out.print("Хорошо");
        if (num == 3)
            System.out.print("Удовлетворительно");
        if (num == 2)
            System.out.print("Нудовлетворительно");

        in.close();
    }
}
