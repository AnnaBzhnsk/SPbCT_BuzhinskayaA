package Third;

public class NumOfNull {
    public static void main(String[] args) {
        int number = 12345;
        System.out.print("Дано число: "+number+"\n");
        char[] a = String.valueOf(number).toCharArray();
        for (int i = 0; i < a.length; i++) {
            if(a[i]%2==0){
                a[i] = '0';
            }
        }
        int number1 = Integer.parseInt(new String(a));
        System.out.print("Преобразованное число: "+number1);
    }
}
