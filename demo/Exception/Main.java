package Exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            // 尝试打开文件并读取内容
            reader = new BufferedReader(new FileReader("file.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            // 处理可能的 IOException
            System.out.println("文件读取错误: " + e.getMessage());
        } finally {
            // 确保关闭文件资源
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("文件关闭错误: " + e.getMessage());
            }
        }
    }
}
