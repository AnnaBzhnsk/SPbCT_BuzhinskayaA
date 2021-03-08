package demo.util;

import java.util.TreeMap;

public class Test11 {
    public Test11() {
    }
    public static void main(String[] args) {
        Test11 t = new Test11();
        TreeMap tm = new TreeMap();
        tm.put("key","String1");
        System.out.println(tm.get("key"));
        tm.put("key","String2");
        System.out.println(tm.get("key"));
    }
}
