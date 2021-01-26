public class FractionalTypes {
    public static void main(String[] args) {
        System.out.println("1e20f*1e20f = " + 1e20f*1e20f);
        System.out.println("-1e20f*1e20f = " + -1e200*1e200);

        System.out.println("1e-40f/1e10f = " + 1e-40f/1e10f);   // underflow для float
        System.out.println("-1e-300/1e100 = " + -1e-300/1e100);

        float f=1e-6f;
        System.out.println(f);
        f+=0.002f;
        System.out.println(f);
        f+=3;
        System.out.println(f);
        f+=4000;
        System.out.println(f);

        double d = 1e-305 * Math.PI;
        System.out.println("1e-305 * Math.PI = " + d);
        for (int i = 0; i < 4; i++)
            System.out.println(d /= 100000);

        System.out.println("1/2. = " + 1/2.);

        int x=3;
        int y=5;
        System.out.println ("3/5 = " + x/y);
        System.out.println("3/5 = " + (double)x/y);
        System.out.println("3/5 = " + 1.0*x/y);
    }
}
