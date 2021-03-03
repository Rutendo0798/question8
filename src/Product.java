import java.util.Arrays;
import java.util.List;
//Rutendo Mauto 200468527

public class Product {

    private String category;
    private String size;
    private String fabric;
    private double price;
    private String productNumber;

    public Product(String Category, String Size, String Fabric, double Price, String productNum) {
        this.category = Category;
        this.size = Size;
        this.fabric = Fabric;
        this.price = Price;
        this.productNumber = productNum;

    }

    public String getCategory() {
        return category;
    }

    public String getSize() {
        return size;
    }

    public String getFabric() {
        return fabric;
    }

    public double getPrice() {
        return price;
    }

    public String getProductNumber() {
        return productNumber;
    }

    public void setCategory(String category) {
    }

    public void setSize(String size) {
    }

    public void setFabric(String fabric) {
    }

    public void setPrice(double price) {
    }

    public void setProductNumber(String productNumber) {
    }

    public String toString()
    {
        return "";
    }
}
