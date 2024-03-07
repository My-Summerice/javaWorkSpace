package File;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReaderTest {

    public static void main(String[] args) throws IOException {

        Files.deleteIfExists(Paths.get("./File/file.txt"));
        Files.write(Paths.get("./File/file.txt"), "中文会导致乱码".getBytes());
        System.out.println("系统默认编码：" + Charset.defaultCharset());

        char[] chars = new char[10];
        String content = "";
        try (FileReader fileReader = new FileReader("./File/file.txt")) {
            int count;
            while ((count = fileReader.read(chars)) != -1) {
                content += new String(chars, 0, count);
            }
        }
        System.out.println(content);

    }
}
