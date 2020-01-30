package object;

public class StringTest {
    public static void main(String[] args) {
        String java1 = new String("java");
        String android = new String("Android");

        StringBuilder buffer = new StringBuilder(java1);
        buffer.append("android");
        java1 = buffer.toString();

        System.out.println(java1);
    }
}
