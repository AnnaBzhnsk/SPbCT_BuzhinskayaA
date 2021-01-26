public class NumberToNumber {
    public static void main(String[] args) {
        int i = 2015;
        long l = (long) (i);
        System.out.println("int "+ i + " to " + "long " + l);

        int e = 2015;
        float f = (float) (e);
        System.out.println("int "+ e + " to " + "float " + f);

        long lo = 214748364;
        int d = (int) lo;
        System.out.println("long "+ lo + " to " + "int " + d);

        double d2 = 3.14;
        int in1 = (int) d2;
        System.out.println("double "+ d2 + " to " + "int " + in1);

    }
}
