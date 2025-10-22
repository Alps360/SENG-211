enum FuelType {
    GASOLINE,
    DIESEL,
    ELECTRIC
}

public class Car {
    String brand;
    String model;
    int year;
    Engine engine;
    FuelType fuelType;

    public Car(String brand, String model, int year, Engine engine, FuelType fuelType) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.engine = engine;
        this.fuelType = fuelType;
    }    

    public void displayInfo() {
        System.out.println(year + " " + brand + " " + model + " ");
        engine.showPower();
        switch (fuelType) {
            case GASOLINE -> System.out.println("Traditional Engine");
            case DIESEL -> System.out.println("Powerful but less eco-friendly");
            case ELECTRIC -> System.out.println("Eco-friendly and quiet");
        }

    }

    public class Main {
        public static void main(String[] args) {
            Engine e1 = new Engine(119);
            Engine e2 = new Engine(190);
            Engine e3 = new Engine(316);
            Car c1 = new Car("Toyota", "Corolla", 2020, e1, FuelType.GASOLINE);
            Car c2 = new Car("BMW", "320d", 2021, e2, FuelType.DIESEL);
            Car c3 = new Car("Tesla", "Model S", 2024, e3, FuelType.ELECTRIC);
            c1.displayInfo();
            c2.displayInfo();
            c3.displayInfo();
        }
    }
}
