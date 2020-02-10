package outputStream;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileOutputTest4 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("writer.txt");
        fw.write('A');
        char[] buf = {'B','C','D','E','F'};

        fw.write(buf);
        fw.write("안녕하세요?");
        fw.write(buf, 3, 2);
        fw.close();

        System.out.println("end");
    }
}