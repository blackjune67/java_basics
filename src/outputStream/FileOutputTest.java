package outputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputTest {
    public static void main(String[] args) {
        try(FileOutputStream fors = new FileOutputStream("output.txt", true)){
            fors.write(65);
            fors.write(66);
            fors.write(67);
            fors.write(95);
            fors.write(90);
            fors.write(85);

            System.out.println("파일을 작성했습니다.");
        } catch (IOException e) {
            System.out.println("파일 에러");
        }
    }
}
