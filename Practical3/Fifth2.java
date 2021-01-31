public class Fifth2 {
    public static void main(String[] args) {
        double a = 1.76, b = 2.34, y1, y2, y3, x1 = 0.59, x2 = 1.06, x3 = -0.58;
        y1 = b*Math.sqrt(Math.pow(Math.abs(x1),3));
        y2 =  a+Math.pow(3, x2);
        y3 = Math.pow(Math.E, -x3);
        if (x1 >=5) {
            System.out.print(y1);
        }
        else if (x2 < 5 & x2 > 2){
            System.out.print(y2);
        }
        else if (x3 <= 2){
            System.out.print(y3);
        }

    }
}
