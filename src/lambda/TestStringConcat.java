package lambda;

public class TestStringConcat {
    public static void main(String[] args) {
        StringConImpl impl = new StringConImpl();
        impl.makeString("안녕", "하세요");

        /*람다 방식*/
        StringConcat concat = (s, v) -> System.out.println(s + "," + v);
        concat.makeString("하이", "헬로");

        /*람다 풀어서 사용한 방식*/
        StringConcat concat2 = new StringConcat() {
            @Override
            public void makeString(String s1, String s2) {
                System.out.println(s1 + "," + s2);
            }
        };
        concat2.makeString("하이", "헬로");

    }
}
