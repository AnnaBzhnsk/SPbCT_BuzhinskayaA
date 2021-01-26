public class CharToString {
    public static void main(String[] args) {
        char ch = 'S';
        String charToString = Character.toString(ch);
        System.out.println("Использование класса Character: " + charToString);

        String str = "" + ch;
        System.out.println("Использование операции добавления класса String: " + str);

        String fromChar = new String(new char[] { ch });
        System.out.println("Использование массива: " + fromChar);

        String valueOfchar = String.valueOf(ch);
        System.out.println("С использованием метода valueOf класса String: " + valueOfchar);



    }
}
