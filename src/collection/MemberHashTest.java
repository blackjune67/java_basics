package collection;

public class MemberHashTest {
    public static void main(String[] args) {
        MemberHashSet manager = new MemberHashSet();
        Member memberLee = new Member(100, "이씨");
        Member memberChoi = new Member(200, "최씨");
        Member memberPark = new Member(300, "박씨");
        Member memberPark2 = new Member(300, "박씨2");

        manager.addMember(memberLee);
        manager.addMember(memberChoi);
        manager.addMember(memberPark);
        manager.addMember(memberPark2);

        manager.ShowAllMember();

        manager.removeMember(100);
        manager.ShowAllMember();
    }
}
