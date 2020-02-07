package streamPackage;

import java.io.InputStreamReader;

public class SystemIntest2 {
    public static void main(String[] args) {
        System.out.println("입력 후 '끝' 이라고 쓰세요.");

        try {
            int i;
            InputStreamReader isr = new InputStreamReader(System.in);

            while ((i = isr.read()) != '끝') {
                System.out.println((char) i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}