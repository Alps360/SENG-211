package Lab6;

public class Bouquet {
    private String theme;
    private Flower flower;
    private int numOfFlowers;

    public Bouquet(String theme, Flower flower, int numOfFlowers) {
        this.theme = theme;
        this.flower = flower;
        this.numOfFlowers = numOfFlowers;
    }

    public String getTheme() {
        return theme;
    }

    public Flower getFlower() {
        return flower;
    }

    public int getNumOfFlowers() {
        return numOfFlowers;
    }

    public void setTheme(String newTheme) {
        this.theme = newTheme;
    }

    public void setFlower(Flower newFlower) {
        this.flower = newFlower;
    }

    public void setNumOfFlowers(int newNumOfFlowers) {
        this.numOfFlowers = newNumOfFlowers;
    }

    public double getCost() {
        return numOfFlowers * getFlower().getUnitPrice();
    }
}
