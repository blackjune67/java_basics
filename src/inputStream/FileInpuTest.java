package inputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInpuTest {
    public static void main(String[] args) {
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("input.txt");

            int i;
            while ((i = fis.read()) != -1) {
                System.out.println((char) i);
            }
        } catch (IOException e) {
            if (e instanceof FileNotFoundException) {
                System.out.println("파일이 잘못됐습니다.");
            } else if (e instanceof IOException) {
                System.out.println("입력이 잘못됐습니다.");
            }
        } finally {
            try {
                fis.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("파일을 다 읽었습니다.");
    }

    /* 위의 것을 오토클로즈로 변경했을 때*/
    /* ===============================================================
       try(FileInputStream fis = new FileInputStream("input.txt")) {
       ================================================================

        int i;
        while ((i = fis.read()) != -1) {
            System.out.println((char) i);
        }
    } catch (IOException e) {
        if (e instanceof FileNotFoundException) {
            System.out.println("파일이 잘못됐습니다.");
        } else if (e instanceof IOException) {
            System.out.println("입력이 잘못됐습니다.");
        }
    }
    */
}
