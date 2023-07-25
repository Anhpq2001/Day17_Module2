package ReadWriteBinaryFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStream1 {
    public static void main(String[] args) throws IOException {
        // tao mot doi tuong inputstream luong doc
        InputStream is =new FileInputStream("src/ReadWriteBinaryFiles/CodeGym");
        int i = -1;
        // khi doc ra -1 thi ket thuc luong
        while((i=is.read()) != -1){
            System.out.println((char)i);
        }
        is.close();
    }
}
