package ReadWriteBinaryFiles;

import java.io.*;

public class DataIOStream {
    public static void main(String[] args) throws IOException {
        // ghi du lieu vao file temp
        try (DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("src/ReadWriteBinaryFiles/temp"))) {
            outputStream.writeUTF("John");
            outputStream.writeDouble(85.5);
            outputStream.writeUTF("Susan");
            outputStream.writeDouble(185.5);
            outputStream.writeUTF("Kim");
            outputStream.writeDouble(105.25);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // doc du lieu tu file
        try(DataInputStream dataInputStream = new DataInputStream(new FileInputStream("src/ReadWriteBinaryFiles/temp"))){
            System.out.println(dataInputStream.readUTF() + " " + dataInputStream.readDouble());
            System.out.println(dataInputStream.readUTF() + " " + dataInputStream.readDouble());
            System.out.println(dataInputStream.readUTF() + " " + dataInputStream.readDouble());
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
}
