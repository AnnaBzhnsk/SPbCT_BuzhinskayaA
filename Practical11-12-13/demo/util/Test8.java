package demo.util;

import java.util.ArrayList;
import java.util.Iterator;

public class Test8 {
    public Test8() {
    }
    public static void main(String[] args) {
        Test8 t = new Test8();
        ArrayList al = new ArrayList();
        al.add("First element");
        al.add("Second element");
        al.add("Third element");
        Iterator it = al.iterator();
        while(it.hasNext()) {
            System.out.println((String)it.next());
        }
        System.out.println("\n");
        al.add(2,"Insertion");
        it = al.iterator();
        while(it.hasNext()){
            System.out.println((String)it.next());
        }
    }
}
