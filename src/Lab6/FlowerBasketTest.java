package Lab6;

public class FlowerBasketTest {
    public static void main(String[] args) {
        Flower flower = new Flower("pink", "Rose", 1.5);
        Bouquet bouquet = new Bouquet("Valentine's Day", flower, 13);
        System.out.println("Cost of the Bouquet: " + bouquet.getCost());
    }
}