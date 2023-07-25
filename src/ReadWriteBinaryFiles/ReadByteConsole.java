package ReadWriteBinaryFiles;

import java.io.IOException;
import java.io.InputStream;

public class ReadByteConsole {
    public static void main(String[] args) throws IOException {
        InputStream is = System.in;
        while(true){
            System.out.println("Enter a charactor: ");
            int ch = is.read();
            if(ch == 'q'){
                System.out.println("Successfully");
                break;
            }
            is.skip(2);
            System.out.println("Result: " + (char)ch);
        }
    }
}
