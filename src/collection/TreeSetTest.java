package collection;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("2. A");
        treeSet.add("1. B");
        treeSet.add("3. C");

        for(String srt : treeSet) {
            System.out.println(srt);
        }
    }
}
