package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetTest {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("A");

        //System.out.println(set);

        Iterator<String> ir = set.iterator();

        while(ir.hasNext()) {
            String sr = ir.next();
            System.out.println(sr);
        }

    }
}
