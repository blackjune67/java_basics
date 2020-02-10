package outputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileOutputTest3 {
    public static void main(String[] args) throws IOException {
        /*
         * FileReader 로 하면 문자열로도 가능 (시스템 기본 인코딩을 사용)
         * FileInputStream 은 인코딩 지정이 가능.
         */
        FileInputStream fis = new FileInputStream("red.txt");
        InputStreamReader isr = new InputStreamReader(fis, "UTF-8");

        int i;
        while ((i = isr.read()) != -1) {
            System.out.print((char) i);
        }
        fis.close();
        System.out.println("파일을 읽었습니다.");
    }
}
