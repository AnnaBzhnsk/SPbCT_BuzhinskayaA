public class NumberToString {
    public static void main(String[] args) {
        int i = 35;
        String str = Integer.toString(i);
        System.out.println(i + " = " + str);

        double  e = 32.4e10;
        String str1 = Double.toString(i);
        System.out.println(e + " = " + str1);

        long  l = 3422222;
        String str2 = Long.toString(i);
        System.out.println(l + " = " + str2);

        float  f = 3.46f;
        String str3 = Float.toString(i);
        System.out.println(f + " = " + str3);

    }
}
