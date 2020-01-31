package collection.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class MemberHashMapTest {
    public static void main(String[] args) {
        MemberHashMap manager = new MemberHashMap();

        Member memberLee = new Member(100, "이씨");
        Member memberHong = new Member(300, "홍씨");
        Member memberChoi = new Member(200, "최씨");

        manager.addMember(memberLee);
        manager.addMember(memberHong);
        manager.addMember(memberChoi);

        manager.showAllMemmber();

        manager.removerMember(200);
        manager.showAllMemmber();

        //System.out.println(set);
        /*while(ir.hasNext()) {
            String sr = ir.next();
            System.out.println(sr);
        }*/

    }
}
