import java.util.Scanner;
public class First {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();
        if (num<100){
            System.out.print("Less \n"); }
        else {
            System.out.print("Not less");
        }
        in.close();
    }
}
