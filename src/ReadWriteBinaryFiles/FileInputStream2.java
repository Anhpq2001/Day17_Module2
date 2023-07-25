package ReadWriteBinaryFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStream2 {
    public static void main(String[] args) throws IOException {
        // tao doi tuong inputstream
        InputStream inputStream = new FileInputStream("src/ReadWriteBinaryFiles/CodeGym");
        byte[] bytes = new byte[10];
        int i = -1;
        while((i = inputStream.read(bytes)) != -1){
            String string = new String(bytes, 0, i);
            System.out.println(string);
        }
        inputStream.close();
    }
}
