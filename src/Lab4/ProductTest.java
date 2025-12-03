package Lab4;

public class ProductTest {
    public static void main(String[] args) {
        Product pro1 = new Product("Iphone 17", 23, 78000);
        Product pro2 = new Product();

        System.out.println("Product1 id: " + pro1.getProductId());
        System.out.println("Product2 id: " + pro2.getProductId());

        System.out.println("Name: " + pro1.getName());
        System.out.println("Quantity: " + pro1.getQuantity());
        System.out.println("Price: " + pro1.getPrice());
        System.out.println("Item Value: " + pro1.getItemValue());

        pro2.setName("Galaxy Z Fold7");
        pro2.setQuantity(20);
        pro2.setPrice(50000);

        System.out.println("Second product information: " + pro2.toString());
    }
}