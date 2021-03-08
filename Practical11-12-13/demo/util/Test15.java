package demo.util;

import java.util.Random;

public class Test15 {
    public Test15() {
    }
    public static void main(String[] args) {
        Test15 test = new Test15();
        Random r = new Random(100);
        // Generating the same sequence numbers
        for(int cnt=0;cnt<9;cnt++){
            System.out.print(r.nextInt() + " ");
        }
        System.out.println();
        r = new Random(100);
        for(int cnt=0;cnt<9;cnt++) {
            System.out.print(r.nextInt() + " ");
        }
        System.out.println();
        // Generating sequence of bytes
        byte[] randArray = new byte[8];
        r.nextBytes(randArray);
        test.dumpArray(randArray);
    }
    void dumpArray(byte[] arr) {
        for(int cnt=0;cnt< arr.length;cnt++) {
            System.out.print(arr[cnt]);
        }
        System.out.println();
    }
}
