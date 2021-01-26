public class IncrementDecrementOperators {
    public static void main(String[] args) {
        byte x=5;
        byte y1=x++;     // на момент начала исполнения x равен 5
        byte y2=x--;      // на момент начала исполнения x равен 6
        byte y3=++x;    // на момент начала исполнения x равен 5
        byte y4=--x;      // на момент начала исполнения x равен 6
        System.out.println(y1);
        System.out.println(y2);
        System.out.println(y3);
        System.out.println(y4);
    }
}
