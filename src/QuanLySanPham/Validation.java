package QuanLySanPham;

import java.util.Scanner;

public class Validation {
    static Scanner scanner = new Scanner(System.in);
    // check empty
    public static String checkEmpt(String message){
        System.out.println(message);
        while(true){
            String input = scanner.nextLine();
            if(input.isEmpty()){
                System.out.println("Value not empty!");
                System.out.println("Enter again: ");
                continue;
            }else{
                return input;
            }
        }
    }
    // check double value
    public static double checkDouble(String message, double min, double max){
        System.out.println(message);
        while(true){
            String input = scanner.nextLine();
            if(input.isEmpty()){
                System.out.println("Value not empty!");
                System.out.println("Enter again: ");
                continue;
            }
            try{
                double value = Double.parseDouble(input);
                if(value <= min || value >= max){
                    throw new NumberFormatException();
                }
                return value;
            }catch (NumberFormatException e){
                System.out.println("Enter value from " + min + " to " + max);
            }
        }
    }
    // check int value
    public static int checkInt(String message, int min, int max){
        System.out.println(message);
        while(true){
            String input = scanner.nextLine();
            if(input.isEmpty()){
                System.out.println("Value not empty!");
                System.out.println("Enter again: ");
                continue;
            }
            try{
                int value = Integer.parseInt(input);
                if(value <= min || value >= max){
                    throw new NumberFormatException();
                }
                return value;
            }catch (NumberFormatException e){
                System.out.println("Enter value from " + min + " to " + max);
            }
        }
    }
}
