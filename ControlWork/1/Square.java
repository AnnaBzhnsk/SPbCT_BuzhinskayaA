package Fifth;

import java.util.Random;

public class Square {
    public static void main(String[] args) {
        Random r = new Random();
        String str = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                char ch = str.charAt(r.nextInt(str.length()));
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
