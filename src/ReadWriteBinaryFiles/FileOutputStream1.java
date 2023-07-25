package ReadWriteBinaryFiles;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStream1 {
    public static void main(String[] args) throws IOException {
        // tao doi tuong outputstream
        OutputStream outputStream = new FileOutputStream("src/ReadWriteBinaryFiles/Output");

        // tao mang de ghi vao file
        byte[] bytes = new byte[]{'C', 'o', 'd', 'e', 'G', 'y', 'm'};
        // vong lap de luu vao file
        for (int i = 0; i < bytes.length; i++) {
               int b = bytes[i];
               outputStream.write(b);
        }
        outputStream.close();
    }
}
