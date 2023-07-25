package ReadWriteBinaryFiles;

import java.io.*;

public class ObjectIOStream {
    public static void main(String[] args) throws IOException{
        //objectOutputStream();
        objectInputStream();
    }
    public static void objectOutputStream() throws IOException{
        ObjectOutputStream oos = null;
        try{
            oos = new ObjectOutputStream(new FileOutputStream("src/ReadWriteBinaryFiles/CodeGym"));
            Product product = new Product(1, "Quang Anh", 12000, "Handsome");
            oos.writeObject(product);
            oos.flush();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            oos.close();
        }
        System.out.println("Successfully!");
    }
    public static void objectInputStream() throws IOException{
        ObjectInputStream ois = null;
        try{
            ois = new ObjectInputStream(new FileInputStream("src/ReadWriteBinaryFiles/CodeGym"));
            Product product = (Product) ois.readObject();
            System.out.println(product);
        }catch(IOException | ClassNotFoundException ex){
            ex.printStackTrace();
        }finally {
            ois.close();
        }
    }
}
class Product implements Serializable{
    private static final long serialVersionUID = -266706354210367639L;

    private int id;
    private String name;
    private double price;
    private String description;

    public Product(int id, String name, double price, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
