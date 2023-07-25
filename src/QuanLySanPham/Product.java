package QuanLySanPham;

import java.io.Serializable;

public class Product implements Serializable {
    private static final long productSERIES = 1234567890;
    private String productID;
    private String productName;
    private double price;
    private String brand;
    private String description;

    public Product() {
    }

    public Product(String productID, String productName, double price, String brand, String description) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.brand = brand;
        this.description = description;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID='" + productID + '\'' +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
