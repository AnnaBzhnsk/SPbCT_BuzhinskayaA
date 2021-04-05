package Fourth;

import java.util.Scanner;

public class MultTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число от 1 до 9: ");
        int num = in.nextInt();
        if(num > 0 && num < 10){
            for(int i = 0; i<10; i++){
                int x = num * i;
                System.out.print(x+"\n");
            }
        }
        else {
            System.out.print("Неверное число");
        }
    }
}
