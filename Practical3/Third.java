import java.util.Scanner;
public class Third {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите названее дня: ");
        String day = in.nextLine();
        if (day.equals("Понедельник")) {
            System.out.print("Номер: 1");
        }
        if (day.equals("Вторник")) {
            System.out.print("Номер: 2");
        }
        if (day.equals("Среда")) {
            System.out.print("Номер: 3");
        }
        if (day.equals("Четверг")) {
            System.out.print("Номер: 4");
        }
        if (day.equals("Пятница")) {
            System.out.print("Номер: 5");
        }
        if (day.equals("Суббота")) {
            System.out.print("Номер: 6");
        }
        if (day.equals("Воскресенье")) {
            System.out.print("Номер: 0");
        }
        in.close();
    }
}
