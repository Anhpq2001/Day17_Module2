package CopyFiles;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input source: ");
        String sourcePath = scanner.nextLine();
        System.out.println("Input dest: ");
        String destPath = scanner.nextLine();

        File sourceFile = new File(sourcePath);
        File destFile = new File(destPath);
        try{
            copyFileUsingStream(sourceFile, destFile);
            System.out.println("Completed");
        }catch(IOException e){
            e.printStackTrace();
            System.out.println("Failed");
        }
    }
    public static void copyFileUsingStream(File source, File dest) throws IOException{
        InputStream is = null;
        OutputStream os = null;
        try{
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] bytes = new byte[1024];
            int length;
            while ((length = is.read(bytes))>0){
                os.write(bytes, 0, length);
            }
        }finally {
            is.close();
            os.close();
        }
    }
}
