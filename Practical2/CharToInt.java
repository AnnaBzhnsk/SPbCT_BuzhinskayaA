public class CharToInt {
    public static void main(String[] args) {
        char ch = '9';
        int i1 = Character.getNumericValue(ch);
        System.out.println("С использованием метода getNumericValue: " + i1);

        int i2 = Character.digit(ch,10);
        System.out.println("С использованием метода digit класса Character: " + i2);


    }
}
