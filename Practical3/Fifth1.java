public class Fifth1 {
    public static void main(String[] args) {
        double a = -2.75, z = 0.15, y1, y2, x1 = 8.45, x2 = 16.55;
        y1 = Math.sqrt(10*(Math.pow(x1, 1/3)+Math.pow(x1, a+2)));
        y2 =  Math.pow(Math.sin(z), 2) + Math.abs(x2+a);
        if (x1 <= 10) {
            System.out.print("y1 = " + y1 + "\n");
        }
        if (x2 > 10){
            System.out.print("y2 = "+y2 + "\n");
        }
    }
}
