import java.util.ArrayList;
import java.util.*;

//Rutendo Mauto 200468527

public class Product {

    private String category;
    private String size;
    private String fabric;
    private double price;
    private String productNumber;

    public Product(String category, String size, String fabric, double price, String productNum) {
        this.category = category;
        this.size = size;
        this.fabric = fabric;
        this.price = price;
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
        ArrayList<String> Category = new ArrayList<String>();
        Category.add("shirt");
        Category.add("sweater");
        Category.add("jacket");
        Category.add("hat");
        Category.add("gloves");
        try {
            Scanner inputReader = new Scanner(System.in);
            System.out.println("Enter product : ");
            String pro;
            pro = inputReader.nextLine();

                if (pro.equals(Category)) {
                    System.out.println("Added!");
                } else {
                    System.out.println("Product Cannot be found");
                }

            } catch(Exception e){
                System.out.println("Cannot be added");

            }

    }

    public void setSize(String size) {
        ArrayList<String> Size = new ArrayList<String>();
        Size.add("X-LARGE");
        Size.add("LARGE");
        Size.add("MEDIUM");
        Size.add("SMALL");
        try {
            Scanner inputReader = new Scanner(System.in);
            System.out.println("Enter size : ");
            String siz;
            siz = inputReader.nextLine();
            if (siz.equals(Size)) {
                System.out.println("Added!");
            }

            else {
                System.out.println("Size Cannot be found");
            }

        }
                catch(Exception e){
                    System.out.println("Enter the right size!");

            }
        }


            }







    public void setFabric(String fabric) {
        ArrayList<String> Fabric = new ArrayList<String>();
        Fabric.add("cotton");
        Fabric.add("denim");
        Fabric.add("wool");
        Fabric.add("nylon");
        try {
            Scanner inputReader = new Scanner(System.in);
            System.out.println("Enter fabric : ");
            String fab;
            fab = inputReader.nextLine();
            if (fab.equals(Fabric)) {
                System.out.println("Added!");
            }

            else {
                System.out.println("Fabric Cannot be found");
            }

        }
        catch(Exception e){
            System.out.println("Enter the right fabric!");

        }
}

    public void setPrice(double price) {
    if (price < 0 && price>200){
        throw new IllegalArgumentException("Value Out of range, as the price should be in a range between 0 & 200");

    }
    }

    public void setProductNumber(String productNumber) {
    }

    public String toString()
    {
        return "";
    }
}
