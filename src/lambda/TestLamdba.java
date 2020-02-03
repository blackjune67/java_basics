package lambda;


interface PrintString {
    void showString(String str);
}

public class TestLamdba {

    public static void main(String[] args) {
        PrintString lambdaStr = s -> System.out.println(s);
        lambdaStr.showString("하이 TEST");

        showMyString(lambdaStr);

        PrintString test = retunrString();
        test.showString("TEST3333");
    }

    public static void showMyString(PrintString p) {
        p.showString("TEST2222");
    }

    public static PrintString retunrString() {
        return s -> System.out.println(s + "!!!!!");
    }
}
