package demo.util;

import java.util.ListResourceBundle;
import java.util.Vector;

public class MyResource1 extends ListResourceBundle {
    Vector v = new Vector();
    Object[][] resources = {
            {"StringKey", "String"},
            {"DoubleKey", new Double(0.0)},
            {"VectorKey", v},
    };

    public MyResource1() {
        super();
        v.add("Element 1");
        v.add("Element 2");
        v.add("Element 3");
    }

    protected Object[][] getContents() {
        return resources;
    }
}
