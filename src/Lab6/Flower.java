package Lab6;

public class Flower {
    private String color;
    private String name;
    private double unitPrice;

    public Flower(String color, String name, Double unitPrice) {
        this.color = color;
        this.name = name;
        this.unitPrice = unitPrice;
    }
    
    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setColor(String newColor) {
        this.color = newColor;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setUnitPrice(Double newUnitPrice) {
        this.unitPrice = newUnitPrice;
    }
}

