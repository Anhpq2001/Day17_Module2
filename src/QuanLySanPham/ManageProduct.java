package QuanLySanPham;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ManageProduct {
    // menu
    public static void menu(){
        while(true){
            System.out.println("1. Display data from file");
            System.out.println("2. Add product to file");
            System.out.println("3. Search data from file");
            System.out.println("4. Exit");
            int choice = Validation.checkInt("Enter your choice: ", 0, Integer.MAX_VALUE);
            switch (choice){
                case 1:
                    displayProduct(readDataFromFile("src/QuanLySanPham/Product"));
                    break;
                case 2:
                    writeDataToFile("src/QuanLySanPham/Product", productList());
                    break;
                case 3:
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
    // function to input values
    public static Product productList() {
        String productId = Validation.checkEmpt("Enter product id: ");
        String productName = Validation.checkEmpt("Enter product name: ");
        double productPrce = Validation.checkDouble("Enter product price:", 0, Double.MAX_VALUE);
        String brand = Validation.checkEmpt("Enter product brand: ");
        String description = Validation.checkEmpt("Enter product description: ");
        Product product = new Product(productId, productName, productPrce, brand, description);
        return product;
    }
    // function display
    public static void displayProduct(List<Product> products){
        for(Product p : products){
            System.out.println(p);
        }
    }
    // function write product to file
    public static void writeDataToFile(String path, Product product){
        try{
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(product);
            oos.close();
            fos.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    // function read product from file
    public static List<Product> readDataFromFile(String path){
        List<Product> products = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return products;
    }
    // function to search

}
