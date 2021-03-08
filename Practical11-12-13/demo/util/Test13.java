package demo.util;

import java.util.StringTokenizer;

public class Test13 {
    public Test13() {
    }
    public static void main(String[] args) {
        Test13 test = new Test13();
        String toParse =
                "word1;word2;word3;word4";
        StringTokenizer st =
                new StringTokenizer(toParse,";");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
