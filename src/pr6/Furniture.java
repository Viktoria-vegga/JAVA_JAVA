package pr6;

public abstract class Furniture {
    private String name;
    private double price;
    private String material;

    public Furniture(String name, double price, String material) {
        this.name = name;
        this.price = price;
        this.material = material;
    }
    public abstract void description(); // Абстрактный метод для описания мебели

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getMaterial() {
        return material;
    }
}